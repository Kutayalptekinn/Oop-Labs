import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;


public class ProcessManager implements IProcessManager{
	private int used_memory_size;
	private int max_memory_size;
	private HashMap<String,Process> processMaps = new HashMap<String,Process>();
	private LinkedList<Process> waitingProcessList = new LinkedList<Process>();
	
	public ProcessManager(int max_memory_size) {
		used_memory_size=0;
		this.max_memory_size=max_memory_size;
	}

	public boolean add_process(User u1, String processName, int i) {
		Process process=new Process(processName,i,u1);
		if(i+used_memory_size<=max_memory_size)
		{		
			used_memory_size+=i;
			processMaps.put(processName,process);
			return true;
		}
			waitingProcessList.add(process);
			return false;	
	}
	


	
	public void print_processes() {
		for(Entry<String, Process> m : processMaps.entrySet()) {
			System.out.println(m.getValue() + ", " + m.getKey());
		}
		
			
		
	}

	public void print_waiting_processes() {
		Iterator<Process> itr = waitingProcessList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
	}
	}


	public boolean remove_process(String name) throws Exception{
		if(!processMaps.containsKey(name)) {
			throw new Exception("Process not found");
		}
		else {
			used_memory_size-=processMaps.get(name).getRequired_memory();
			processMaps.remove(name);
			java.util.Iterator<Process> itr = waitingProcessList.iterator();
			while(itr.hasNext() && used_memory_size<=max_memory_size ) {
				Process my=itr.next();
				add_process( my.getUser(),  my.getName(), my.getRequired_memory());
			}
			return true;
		}
	}

	public int getUsed_memory_size() {
		
		return used_memory_size;
	}

	





}
