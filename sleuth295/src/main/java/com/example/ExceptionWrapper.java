/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

import java.io.Serializable;

/**
 * @author Gary Russell
 * @since 4.3
 *
 */
@SuppressWarnings("serial")
public class ExceptionWrapper implements Serializable {

	private final Throwable throwable;

	public ExceptionWrapper(Throwable throwable) {
		this.throwable = throwable;
	}

	public Throwable getThrowable() {
		return this.throwable;
	}

}
