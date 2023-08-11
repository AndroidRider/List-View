package com.androidrider.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView



class ListViewAdapter(context: Context, private val resource: Int, private val originalItems: ArrayList<ListViewModel>) :
    ArrayAdapter<ListViewModel>(context, resource, originalItems), Filterable {

    private val items: ArrayList<ListViewModel> = ArrayList(originalItems)

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): ListViewModel {
        return items[position]
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(context)
        val view = convertView ?: layoutInflater.inflate(resource, parent, false)

        val currentItem = items[position]

        val itemImage = view.findViewById<ImageView>(R.id.icon)
        val itemTitle = view.findViewById<TextView>(R.id.title)
        val itemDescription = view.findViewById<TextView>(R.id.description)

        itemImage.setImageResource(currentItem.image)
        itemTitle.text = currentItem.title
        itemDescription.text = currentItem.description

        return view
    }

    override fun getFilter(): Filter = object : Filter() {
        // This function runs on a background thread and filters the data based on the search query.
        override fun performFiltering(constraint: CharSequence?): FilterResults =
            FilterResults().apply {
                values = if (constraint.isNullOrBlank()) originalItems else
                    originalItems.filter { item ->
                        item.title.contains(constraint, ignoreCase = true) ||
                                item.description.contains(constraint, ignoreCase = true)
                    }
            }

        // This function runs on the UI thread and updates the adapter with filtered results.
        @Suppress("UNCHECKED_CAST")
        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            items.apply {
                clear()
                addAll(results?.values as List<ListViewModel>)
            }
            notifyDataSetChanged()
        }
    }


}
