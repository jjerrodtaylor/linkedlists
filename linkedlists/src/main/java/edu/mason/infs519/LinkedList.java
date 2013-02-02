package edu.mason.infs519;

/**
 * Hello world!
 *
 */
public class LinkedList
{
    //class that declares the nodes

    private class node
    {
        private int data;
        private node link;

        node(int data, node link)
        {
            this.data = data;
            this.link = link;
        }

        node(node link)
        {
            this.link = link;
        }


        public int getData()
        {
            return this.data;
        }

        public node getLink()
        {
            return this.link;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public void setLink(node link)
        {
            this.link = link;
        }
    }

    private node head;
    private node tail;
    private node selection = new node(null);

    //constructor creates a single node with a null link
    LinkedList()
    {
        this.head = new node(null);

    }

    public int length()
    {
        int counter = 0;
        selection.link = head.link;
        if(this.head.link == null)
        {
            return 0;
        }

        while(this.selection.link != null)
        {
            counter += 1;
            if(selection.link.link == null)
            {
                break;
            }
            else
            {
                selection.link = selection.link.link;
            }
        }
        return counter;
    }

    //adds a new node to the head of the list
    public void addToHead(int element)
    {
        node newNode = new node(element, null);
        //if the head is null then the list is empty
        if(this.head.link == null)
        {
            head.link = newNode;
        }
        else
        {
            //this means that there is at least one other element in the list
            newNode.link = head.link;
            head.link = newNode;
        }
    }
    public void addNodeAfter(int element)
    {

    }


}
