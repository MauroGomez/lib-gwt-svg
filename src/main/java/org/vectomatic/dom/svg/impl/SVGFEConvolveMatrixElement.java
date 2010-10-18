/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of lib-gwt-svg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */

package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedBoolean;
import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedInteger;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedNumberList;
import org.vectomatic.dom.svg.OMSVGAnimatedString;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
 * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
 */
public class SVGFEConvolveMatrixElement extends SVGElement {
  protected SVGFEConvolveMatrixElement() {
  }

  // Implementation of the svg::SVGFEConvolveMatrixElement W3C IDL interface
  /**
   * Corresponds to attribute <code>in</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedString getIn1() /*-{
    return this.in1;
  }-*/;
  /**
   * Corresponds to attribute <code>order</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedInteger getOrderX() /*-{
    return this.orderX;
  }-*/;
  /**
   * Corresponds to attribute <code>order</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedInteger getOrderY() /*-{
    return this.orderY;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement#getKernelMatrix()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedNumberList getKernelMatrix() /*-{
    return this.kernelMatrix;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement#getDivisor()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedNumber getDivisor() /*-{
    return this.divisor;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement#getBias()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedNumber getBias() /*-{
    return this.bias;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement#getTargetX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedInteger getTargetX() /*-{
    return this.targetX;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement#getTargetY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedInteger getTargetY() /*-{
    return this.targetY;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement#getEdgeMode()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   * Takes one of the SVG_EDGEMODE_ constants defined on this interface.
   */
  public final native OMSVGAnimatedEnumeration getEdgeMode() /*-{
    return this.edgeMode;
  }-*/;
  /**
   * Corresponds to attribute <code>kernelUnitLength</code> on the given <a
   * href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedNumber getKernelUnitLengthX() /*-{
    return this.kernelUnitLengthX;
  }-*/;
  /**
   * Corresponds to attribute <code>kernelUnitLength</code> on the given <a
   * href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedNumber getKernelUnitLengthY() /*-{
    return this.kernelUnitLengthY;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement#getPreserveAlpha()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final native OMSVGAnimatedBoolean getPreserveAlpha() /*-{
    return this.preserveAlpha;
  }-*/;

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final native OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final native OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final native OMSVGAnimatedLength getWidth() /*-{
    return this.width;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final native OMSVGAnimatedLength getHeight() /*-{
    return this.height;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final native OMSVGAnimatedString getResult() /*-{
    return this.result;
  }-*/;

}
