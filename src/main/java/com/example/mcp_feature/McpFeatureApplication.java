package com.example.mcp_feature;

import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbacks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class McpFeatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpFeatureApplication.class, args);
	}

	@Bean
	public List<ToolCallback> yTools(courseService courseService)
	{
		return List.of(
				ToolCallbacks.from(
						courseService
				)
		);
	}
}
