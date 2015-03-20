# Starting with Knapsack

## What is Knapsack?

  Knapsack is an API (Application Programming Interface) that provides a layer of abstraction above the original Binder source code. Knapsack can be used by anyone, and is free. Knapsack is designed to make the modification and programming of Binder extensions easy, and fun.

## First Code

  Knapsack is an API, meaning that it is only a layer above Binder, and Binder still runs the show. Knapsack provides easy-to-use method calls to do powerful things in Binder.

  Say we wanted to place a block at a specific location in the current game world, let's say a dirt block, at the point (0, 1, 5). To do this we would simply add:

    Knapsack.getCurrentWorld().setBlock(Block.DIRT, 0, 1, 5);

  Now, let's say we wanted to remove that block from the rendering query. We simply put:
   
    Knapsack.getCurrentWorld().removeBlock(0, 1, 5);

  This simply sets that block to air, which is not rendered by Binder.

## Licensing

  Knapsack is released under the [Knapsack license (https://github.com/BiggerOnTheInside/Licenses/blob/master/Knapsack.txt).

# Contributing to the Knapsack

## What you need

  In order to work and contribute to Knapsack, you need a copy of [Eclipse](eclipse.org), a [Java virtual machine](java.com), a copy of the Knapsack API, and a [GitHub](github.com)account. 

  Install Eclipse and the Java virtual machine, and import the Knapsack API. Now your ready to write some code!

## What to do

### Repairing 'leaks'

  One of the most important parts of working with Knapsack (or any bag) is to make sure it can do what you need it to. We use Github's built in issue system to work out and fix these issues. If you find an issue you would like to fix, just create a pull request, and begin working. Please provide a list of files you altered, and any major things you did. 

  If your submission is benefiting the project it will be submitted.