package com.example.recycleview_inside_nestedscrolview_6_injava.model



class Member {
    var first_name: String? = null
    var last_name: String? = null

    constructor() {}
    constructor(first_name: String?, last_name: String?) {
        this.first_name = first_name
        this.last_name = last_name
    }
}