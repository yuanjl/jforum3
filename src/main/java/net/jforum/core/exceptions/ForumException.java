/*
 * Copyright (c) JForum Team. All rights reserved.
 *
 * The software in this package is published under the terms of the LGPL
 * license a copy of which has been included with this distribution in the
 * license.txt file.
 *
 * The JForum Project
 * http://www.jforum.net
 */
package net.jforum.core.exceptions;

/**
 * @author Rafael Steil
 */
public class ForumException extends RuntimeException {
	public ForumException(String message) {
		super(message);
	}

	public ForumException(Throwable t) {
		super(t);
		this.setStackTrace(t.getStackTrace());
	}

	public ForumException(String message, Throwable t) {
		super(message, t);
		this.setStackTrace(t.getStackTrace());
	}
}
