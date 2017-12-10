public class PipelineNode
{
    public PipelineNode(int pos, String descr, PipelineNode ptr) //Constructor
    {
        position = pos;
        description = descr;
        nextNode = ptr;
    }
    public int position;
    public String description;
    public PipelineNode nextNode;
}