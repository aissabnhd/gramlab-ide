/*
 * Unitex
 *
 * Copyright (C) 2001-2018 Université Paris-Est Marne-la-Vallée <unitex@univ-mlv.fr>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.
 *
 */
package fr.umlv.unitex.tfst.tagging;

public enum TaggingState {
	/* The box has been selected by the user */
	/* in actuality, a SELECTED box is a box which is both accessible and coaccessible */
	SELECTED,
	/* The box is competing with a selected box and so, must be discarded  */
	/* This state could be used to check the new boxes added to the existing connected part of the graph */
	TO_BE_REMOVED,
	/* The box is not both accessible and co-accessible */
	USELESS,
	/* None of previous cases */
	/* Parallel boxes are tagged NEUTRAL */
	NEUTRAL
}
