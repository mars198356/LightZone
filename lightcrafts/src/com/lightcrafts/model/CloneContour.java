/* Copyright (C) 2005-2011 Fabio Riccardi */

package com.lightcrafts.model;

import java.awt.geom.Point2D;

/**
 * A Contour with one extra piece of information: a Point2D, a location on
 * the image in image coordiantes, that defines a translation interval for
 * cloning.
 * <p>
 * @see com.lightcrafts.model.CloneOperation
 */

public interface CloneContour extends Contour {

    /**
     * Get the Point2D that tells a CloneOperationImpl how to translate the image
     * for cloning onto this Contour.
     * @return The image point for translation, in image coordinates.
     */
    Point2D getClonePoint();
}
