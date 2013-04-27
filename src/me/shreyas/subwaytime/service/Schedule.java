package me.shreyas.subwaytime.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import me.shreyas.subwaytime.model.Feed;
import me.shreyas.subwaytime.service.helper.ScheduleFetcher;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.gson.Gson;

@Api(
	version = "v1",
	name = "schedule"
)
public class Schedule {
	
	@ApiMethod(
		name = "hw",
		path = "hw",
		httpMethod = HttpMethod.GET
	)
	public Feed helloWorld() {
		final String json = ScheduleFetcher.fetchSchedule("red");
		final Gson gson = new Gson();
		final Feed f = gson.fromJson(json, Feed.class);
		return f;
	}
	/*public List<String> helloWorld() {
		final List<String> ret = new ArrayList<String>();
		final String json = ScheduleFetcher.fetchSchedule("red"); 
		ret.add(json);
		Gson gson = new Gson();
		
		Feed f = gson.fromJson(json, Feed.class);
		System.out.println(f.toString());
		ret.add(f.toString());
		ret.add("foo");
		ret.add("bar");
		return ret;
	}*/
		
}
