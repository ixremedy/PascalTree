package com.forthreal.tests

import com.forthreal.classes.TreeBuilder
import org.junit.Test

class TreeBuilderTests
{
    @Test
    fun test1()
    {
        TreeBuilder.buildTree( 3 )
    }

    @Test
    fun test2()
    {
        TreeBuilder.buildTree( 7 )
    }

    @Test
    fun test3()
    {
        TreeBuilder.buildTree( 11 )
    }

}