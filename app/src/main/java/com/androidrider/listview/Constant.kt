package com.androidrider.listview

import android.content.Context
import kotlin.coroutines.coroutineContext

object Constant {

    var items = ArrayList<ListViewModel>()
    fun getData(): ArrayList<ListViewModel>{

        items = ArrayList()

        // C
       val c= "C is a general-purpose programming language that is extremely popular, simple, and flexible to use."
        // C++
        val cp="C++ is one of the world's most popular programming languages."
        // C#
        val csp="C++ is one of the world's most popular programming languages."
        // Java
        val java="Java is a widely-used programming language for coding web applications."
        // Kotlin
        val kotlin= "Kotlin is a new open source programming language like Java, JavaScript, Python etc."
        // .Net
        val net= "The .NET Framework is a proprietary software framework developed by Microsoft that runs primarily on Microsoft Windows."
        // Ruby
        val ruby="A dynamic, open source programming language with a focus on simplicity and productivity."
        // Rails
        val rails="A Ruby on Rails developer is responsible for writing server-side web application logic in Ruby, around the framework Rails."
        // Python
        val python="Python is an interpreted, object-oriented, high-level programming language with dynamic semantics."
        // Java Script
        val javascript="JavaScript is the Programming Language for the Web.\nJavaScript can update and change both HTML and CSS.\nJavaScript can calculate, manipulate and validate data."
        // PHP
        val php="PHP is an acronym for \"PHP: Hypertext Preprocessor\nPHP is a widely-used, open source scripting language\nPHP scripts are executed on the server\nPHP is free to download and use"
        // AJAX
        val ajax="AJAX = Asynchronous JavaScript And XML.\nAJAX is not a programming language.\nAJAX just uses a combination of:\n" +
                "A browser built-in XMLHttpRequest object (to request data from a web server)\nJavaScript and HTML DOM (to display or use the data)"
        // Perl
        val perl="Perl, a cross-platform open-source computer programming language used widely in the commercial and private computing sectors."
        // Hadoop
        val hadoop="Hadoop is an open source framework based on Java that manages the storage and processing of large amounts of data for applications."


        // Add items to the ArrayList
        items.add(ListViewModel("C", c, R.drawable.c_logo))
        items.add(ListViewModel("C++", cp, R.drawable.cplus_logo))
        items.add(ListViewModel("c#", csp, R.drawable.c_sharp_logo))
        items.add(ListViewModel("Java", java, R.drawable.java_logo))
        items.add(ListViewModel("Kotlin", kotlin, R.drawable.kotlin_logo))
        items.add(ListViewModel("Python", python, R.drawable.python_logo))
        items.add(ListViewModel("Ruby", ruby, R.drawable.ruby_logo))
        items.add(ListViewModel("Hadoop", hadoop, R.drawable.hadoop_logo))
        items.add(ListViewModel("PHP", php, R.drawable.php_logo))
        items.add(ListViewModel("Rails", rails, R.drawable.rails_logo))
        items.add(ListViewModel("Java Script", javascript, R.drawable.javascript_logo))
        items.add(ListViewModel("Perl", perl, R.drawable.perl_logo))
        items.add(ListViewModel(".Net", net, R.drawable.dot_net_logo))
        items.add(ListViewModel("Ajax", ajax, R.drawable.ajax_logo))
        items.add(ListViewModel("Scala", "other", R.drawable.scala_logo))
        items.add(ListViewModel("Objective-C", "other", R.drawable.objective_c_logo))
        items.add(ListViewModel("Haskell", "other", R.drawable.haskell_logo))
        items.add(ListViewModel("SQL", "other", R.drawable.sql_logo))
        items.add(ListViewModel("Rust", "other", R.drawable.rust_logo))
        items.add(ListViewModel("HTML", "other", R.drawable.html_logo))
        items.add(ListViewModel("Ada", "other", R.drawable.ada_logo))
        items.add(ListViewModel("Lisp", "other", R.drawable.lisp_logo))
        items.add(ListViewModel("Fortran", "other", R.drawable.fortran_logo))
        items.add(ListViewModel("Swift", "other", R.drawable.swift_logo))
        items.add(ListViewModel("TypeScript", "other", R.drawable.typescript_logo))
        items.add(ListViewModel("COBOL", "other", R.drawable.cobol_logo))
        items.add(ListViewModel("Assembly Language", "other", R.drawable.assembly_language_logo))
        items.add(ListViewModel("Dart", "other", R.drawable.dart_logo))
        items.add(ListViewModel("Go", "other", R.drawable.go_logo))
        items.add(ListViewModel("R", "other", R.drawable.r_logo))
        items.add(ListViewModel("MatLab", "other", R.drawable.matlab_logo))
        items.add(ListViewModel("NoSQL", "other", R.drawable.nosql_logo))

        return items
    }
}