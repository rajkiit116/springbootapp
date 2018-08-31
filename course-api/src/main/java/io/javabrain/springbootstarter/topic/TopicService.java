package io.javabrain.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("java","raj ","github"),
			new Topic("spring","spring-framework","spring-framework-description"),
			new Topic("jersey","jersey-framework","jersey-framework-description")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic top = topics.get(i);
			if (id.equals(top.getId())) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < topics.size(); i++) {
			Topic topic=topics.get(i);
			if(id.equals(topic.getId())) {
				topics.remove(i);
			}
			
			//topics.removeIf(t->t.getId().equals(id));
		}
		
	}
	
	
}
