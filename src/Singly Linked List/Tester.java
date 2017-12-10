public class Tester
{
    public static void main(String args[])
    {
        //Creation of the nodes
        append(0, "Pump station");
        append(3050, "Hwy 35");
        append(4573, "Tank farm"); // 3050 + 1523 = 4573

        traverseAndPrint( );
        System.out.println("******* now insert a node before old node 2 *******\n");
        insert(4040, "Cold Creek", 2);
        traverseAndPrint( );
    }

    public static void append(int pos, String descr)
    {
        PipelineNode newNode = new PipelineNode(pos, descr, null);
        if(headNode == null) 
        { 
            headNode = newNode;
        }
        else
        {
            tailNode.nextNode = newNode; 
        }
        tailNode = newNode; 
    }

    public static void traverseAndPrint( )
    {
        PipelineNode currentNode = headNode;
        int nodeNum = -1;
        do
        {
            nodeNum++;
            System.out.println("Node number: " + nodeNum);
            System.out.println("Position: " + currentNode.position);
            System.out.println("Description: " + currentNode.description);
            System.out.println(""); 
            currentNode = currentNode.nextNode;
        }while(currentNode != null);
    } 

    public static void insert(int pos, String descr, int indx)
    {

        PipelineNode insertNode = new PipelineNode(pos, descr, null);
        PipelineNode currentNode = headNode;
        if(indx == 0)
        {
            insertNode.nextNode = headNode;
            headNode = insertNode; 
        }
        else
        {
            int nodeNum = -1;
            do
            {
                nodeNum++;
                if (nodeNum == indx - 1)
                {
                    insertNode.nextNode = currentNode.nextNode;
                    currentNode.nextNode = insertNode;
                }
                currentNode = currentNode.nextNode;
            }while(currentNode != null);
        }
    } 
    // Method Name	    : insertNode
    // Parameters		: String int
    // Return value(s)	: node
    // Description		: finding the currentNode and swapping it with the insertNode to get the new location 
    // Decription...    : in the map list. Also it's taking the headNode and switching them if indx equals 0.

    private static PipelineNode headNode = null;
    private static PipelineNode tailNode = null;
}