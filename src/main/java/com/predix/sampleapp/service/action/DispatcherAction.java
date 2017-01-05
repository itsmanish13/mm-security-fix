package com.predix.sampleapp.service.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class DispatcherAction {

	private final Map<Class<?>, ESAction<?, ?>> actionMap = new HashMap<>();

	public <R, S> void registerAction(Class<?> clazz, WSAction<R, S> woAction) {

		actionMap.put(clazz, woAction);

	}

	@SuppressWarnings("unchecked")
	public <S, R> S dispatchAction(Class<?> clazz, R req) {
		return ((ESAction<R, S>) actionMap.get(clazz)).perform(req);

	}

}
