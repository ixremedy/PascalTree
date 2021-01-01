package com.forthreal.classes

class TreeBuilder
{
    companion object {

        fun buildTree(dimension: Int)
        {
            val vals = Array( dimension) { IntArray(dimension) }

            val indent =
                if (dimension > 5) dimension + dimension / 3
                else dimension

            /* indent to show the tree */
            for( z in 0..( indent + 1 ) )
            {
                System.out.print(" ")
            }

            vals[0][0] = 1

            System.out.println("1")

            for( i in 1..(dimension - 1) )
            {
                /* indent to show the tree */
                for( z in 0..(indent - i) )
                {
                    System.out.print(" ")
                }

                /* additional indenting for the rows without tens */
                if( i <= 4 )
                {
                    System.out.print(" ")
                }

                for( j in 0..i )
                {
                    if( j > 0 )
                    {
                        vals[i][j] = vals[i - 1][j - 1] + vals[i - 1][j]
                    }
                    else
                    {
                        vals[i][j] = vals[i - 1][j]
                    }

                    System.out.print("${vals[i][j]} ")
                }

                System.out.println(" ")
            }
        }

    }
}