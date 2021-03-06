/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg.impl;

import at.bestsolution.efxclipse.formats.svg.svg.Alignment_baseline;
import at.bestsolution.efxclipse.formats.svg.svg.Clip_rule;
import at.bestsolution.efxclipse.formats.svg.svg.Color_interpolation;
import at.bestsolution.efxclipse.formats.svg.svg.Color_interpolation_filters;
import at.bestsolution.efxclipse.formats.svg.svg.Color_rendering;
import at.bestsolution.efxclipse.formats.svg.svg.ContentElement;
import at.bestsolution.efxclipse.formats.svg.svg.CoreAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.Direction;
import at.bestsolution.efxclipse.formats.svg.svg.Display;
import at.bestsolution.efxclipse.formats.svg.svg.Dominant_baseline;
import at.bestsolution.efxclipse.formats.svg.svg.Fill_rule;
import at.bestsolution.efxclipse.formats.svg.svg.Font_stretch;
import at.bestsolution.efxclipse.formats.svg.svg.Font_style;
import at.bestsolution.efxclipse.formats.svg.svg.Font_variant;
import at.bestsolution.efxclipse.formats.svg.svg.Font_weight;
import at.bestsolution.efxclipse.formats.svg.svg.GradientElement;
import at.bestsolution.efxclipse.formats.svg.svg.GradientUnits;
import at.bestsolution.efxclipse.formats.svg.svg.Image_rendering;
import at.bestsolution.efxclipse.formats.svg.svg.Overflow;
import at.bestsolution.efxclipse.formats.svg.svg.Pointer_events;
import at.bestsolution.efxclipse.formats.svg.svg.PresentationAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.Shape_rendering;
import at.bestsolution.efxclipse.formats.svg.svg.SpreadMethod;
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linecap;
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linejoin;
import at.bestsolution.efxclipse.formats.svg.svg.SvgElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPackage;
import at.bestsolution.efxclipse.formats.svg.svg.SvgRadialGradientElement;
import at.bestsolution.efxclipse.formats.svg.svg.Text_anchor;
import at.bestsolution.efxclipse.formats.svg.svg.Text_rendering;
import at.bestsolution.efxclipse.formats.svg.svg.Unicode_bidi;
import at.bestsolution.efxclipse.formats.svg.svg.Visibility;
import at.bestsolution.efxclipse.formats.svg.svg.Writing_mode;
import at.bestsolution.efxclipse.formats.svg.svg.XLinkAttributes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radial Gradient Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXml__base <em>Xml base</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXml__lang <em>Xml lang</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXml__space <em>Xml space</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getAlignment_baseline <em>Alignment baseline</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getBaseline_shift <em>Baseline shift</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getClip <em>Clip</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getClip_path <em>Clip path</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getClip_rule <em>Clip rule</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getColor <em>Color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getColor_interpolation <em>Color interpolation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getColor_interpolation_filters <em>Color interpolation filters</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getColor_profile <em>Color profile</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getColor_rendering <em>Color rendering</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getCursor <em>Cursor</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getDominant_baseline <em>Dominant baseline</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getEnable_background <em>Enable background</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFill_opacity <em>Fill opacity</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFill_rule <em>Fill rule</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFlood_color <em>Flood color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFlood_opacity <em>Flood opacity</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFont_family <em>Font family</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFont_size <em>Font size</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFont_size_adjust <em>Font size adjust</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFont_stretch <em>Font stretch</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFont_style <em>Font style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFont_variant <em>Font variant</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFont_weight <em>Font weight</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getGlyph_orientation_horizontal <em>Glyph orientation horizontal</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getGlyph_orientation_vertical <em>Glyph orientation vertical</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getImage_rendering <em>Image rendering</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getKerning <em>Kerning</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getLetter_spacing <em>Letter spacing</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getLighting_color <em>Lighting color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getMarker_end <em>Marker end</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getMarker_mid <em>Marker mid</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getMarker_start <em>Marker start</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getMasks <em>Masks</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getPointer_events <em>Pointer events</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getShape_rendering <em>Shape rendering</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStop_color <em>Stop color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStop_opacity <em>Stop opacity</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStroke_dasharray <em>Stroke dasharray</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStroke_dashoffset <em>Stroke dashoffset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStroke_linecap <em>Stroke linecap</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStroke_linejoin <em>Stroke linejoin</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStroke_miterlimit <em>Stroke miterlimit</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStroke_opacity <em>Stroke opacity</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStroke_width <em>Stroke width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getText_anchor <em>Text anchor</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getText_decoration <em>Text decoration</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getText_rendering <em>Text rendering</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getUnicode_bidi <em>Unicode bidi</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getWord_spacing <em>Word spacing</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getWriting_mode <em>Writing mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXlink__href <em>Xlink href</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXlink__show <em>Xlink show</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXlink__actuate <em>Xlink actuate</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXlink__type <em>Xlink type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXlink__role <em>Xlink role</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXlink__arcrole <em>Xlink arcrole</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getXlink__title <em>Xlink title</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getResolvedInstance <em>Resolved Instance</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getExternalResourcesRequired <em>External Resources Required</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getR <em>R</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFx <em>Fx</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getFy <em>Fy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getSpreadMethod <em>Spread Method</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getGradientUnits <em>Gradient Units</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.impl.SvgRadialGradientElementImpl#getGradientTransform <em>Gradient Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SvgRadialGradientElementImpl extends EObjectImpl implements SvgRadialGradientElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml__base() <em>Xml base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__base()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml__base() <em>Xml base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__base()
	 * @generated
	 * @ordered
	 */
	protected String xml__base = XML_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml__lang() <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__lang()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml__lang() <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__lang()
	 * @generated
	 * @ordered
	 */
	protected String xml__lang = XML_LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml__space() <em>Xml space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__space()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml__space() <em>Xml space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml__space()
	 * @generated
	 * @ordered
	 */
	protected String xml__space = XML_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment_baseline() <em>Alignment baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment_baseline()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment_baseline ALIGNMENT_BASELINE_EDEFAULT = Alignment_baseline.AUTO;

	/**
	 * The cached value of the '{@link #getAlignment_baseline() <em>Alignment baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment_baseline()
	 * @generated
	 * @ordered
	 */
	protected Alignment_baseline alignment_baseline = ALIGNMENT_BASELINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseline_shift() <em>Baseline shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline_shift()
	 * @generated
	 * @ordered
	 */
	protected static final String BASELINE_SHIFT_EDEFAULT = "\"baseline\"";

	/**
	 * The cached value of the '{@link #getBaseline_shift() <em>Baseline shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline_shift()
	 * @generated
	 * @ordered
	 */
	protected String baseline_shift = BASELINE_SHIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClip() <em>Clip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClip()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_EDEFAULT = "auto";

	/**
	 * The cached value of the '{@link #getClip() <em>Clip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClip()
	 * @generated
	 * @ordered
	 */
	protected String clip = CLIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getClip_path() <em>Clip path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClip_path()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_PATH_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getClip_path() <em>Clip path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClip_path()
	 * @generated
	 * @ordered
	 */
	protected String clip_path = CLIP_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getClip_rule() <em>Clip rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClip_rule()
	 * @generated
	 * @ordered
	 */
	protected static final Clip_rule CLIP_RULE_EDEFAULT = Clip_rule.NONZERO;

	/**
	 * The cached value of the '{@link #getClip_rule() <em>Clip rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClip_rule()
	 * @generated
	 * @ordered
	 */
	protected Clip_rule clip_rule = CLIP_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor_interpolation() <em>Color interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor_interpolation()
	 * @generated
	 * @ordered
	 */
	protected static final Color_interpolation COLOR_INTERPOLATION_EDEFAULT = Color_interpolation.SRGB;

	/**
	 * The cached value of the '{@link #getColor_interpolation() <em>Color interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor_interpolation()
	 * @generated
	 * @ordered
	 */
	protected Color_interpolation color_interpolation = COLOR_INTERPOLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor_interpolation_filters() <em>Color interpolation filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor_interpolation_filters()
	 * @generated
	 * @ordered
	 */
	protected static final Color_interpolation_filters COLOR_INTERPOLATION_FILTERS_EDEFAULT = Color_interpolation_filters.AUTO;

	/**
	 * The cached value of the '{@link #getColor_interpolation_filters() <em>Color interpolation filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor_interpolation_filters()
	 * @generated
	 * @ordered
	 */
	protected Color_interpolation_filters color_interpolation_filters = COLOR_INTERPOLATION_FILTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor_profile() <em>Color profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor_profile()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_PROFILE_EDEFAULT = "\"auto\"";

	/**
	 * The cached value of the '{@link #getColor_profile() <em>Color profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor_profile()
	 * @generated
	 * @ordered
	 */
	protected String color_profile = COLOR_PROFILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor_rendering() <em>Color rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor_rendering()
	 * @generated
	 * @ordered
	 */
	protected static final Color_rendering COLOR_RENDERING_EDEFAULT = Color_rendering.AUTO;

	/**
	 * The cached value of the '{@link #getColor_rendering() <em>Color rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor_rendering()
	 * @generated
	 * @ordered
	 */
	protected Color_rendering color_rendering = COLOR_RENDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSOR_EDEFAULT = "\"auto\"";

	/**
	 * The cached value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected String cursor = CURSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.LTR;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final Display DISPLAY_EDEFAULT = Display.INLINE;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected Display display = DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDominant_baseline() <em>Dominant baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDominant_baseline()
	 * @generated
	 * @ordered
	 */
	protected static final Dominant_baseline DOMINANT_BASELINE_EDEFAULT = Dominant_baseline.AUTO;

	/**
	 * The cached value of the '{@link #getDominant_baseline() <em>Dominant baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDominant_baseline()
	 * @generated
	 * @ordered
	 */
	protected Dominant_baseline dominant_baseline = DOMINANT_BASELINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnable_background() <em>Enable background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable_background()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_BACKGROUND_EDEFAULT = "\"inherit\"";

	/**
	 * The cached value of the '{@link #getEnable_background() <em>Enable background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable_background()
	 * @generated
	 * @ordered
	 */
	protected String enable_background = ENABLE_BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_EDEFAULT = "black";

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected String fill = FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFill_opacity() <em>Fill opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill_opacity()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_OPACITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getFill_opacity() <em>Fill opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill_opacity()
	 * @generated
	 * @ordered
	 */
	protected String fill_opacity = FILL_OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFill_rule() <em>Fill rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill_rule()
	 * @generated
	 * @ordered
	 */
	protected static final Fill_rule FILL_RULE_EDEFAULT = Fill_rule.NONZERO;

	/**
	 * The cached value of the '{@link #getFill_rule() <em>Fill rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill_rule()
	 * @generated
	 * @ordered
	 */
	protected Fill_rule fill_rule = FILL_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = "\"none\"";

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlood_color() <em>Flood color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlood_color()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOOD_COLOR_EDEFAULT = "\"black\"";

	/**
	 * The cached value of the '{@link #getFlood_color() <em>Flood color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlood_color()
	 * @generated
	 * @ordered
	 */
	protected String flood_color = FLOOD_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlood_opacity() <em>Flood opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlood_opacity()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOOD_OPACITY_EDEFAULT = "\"1\"";

	/**
	 * The cached value of the '{@link #getFlood_opacity() <em>Flood opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlood_opacity()
	 * @generated
	 * @ordered
	 */
	protected String flood_opacity = FLOOD_OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont_family() <em>Font family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_family()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont_family() <em>Font family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_family()
	 * @generated
	 * @ordered
	 */
	protected String font_family = FONT_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont_size() <em>Font size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_size()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = "\"medium\"";

	/**
	 * The cached value of the '{@link #getFont_size() <em>Font size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_size()
	 * @generated
	 * @ordered
	 */
	protected String font_size = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont_size_adjust() <em>Font size adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_size_adjust()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_ADJUST_EDEFAULT = "\"none\"";

	/**
	 * The cached value of the '{@link #getFont_size_adjust() <em>Font size adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_size_adjust()
	 * @generated
	 * @ordered
	 */
	protected String font_size_adjust = FONT_SIZE_ADJUST_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont_stretch() <em>Font stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_stretch()
	 * @generated
	 * @ordered
	 */
	protected static final Font_stretch FONT_STRETCH_EDEFAULT = Font_stretch.NORMAL;

	/**
	 * The cached value of the '{@link #getFont_stretch() <em>Font stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_stretch()
	 * @generated
	 * @ordered
	 */
	protected Font_stretch font_stretch = FONT_STRETCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont_style() <em>Font style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_style()
	 * @generated
	 * @ordered
	 */
	protected static final Font_style FONT_STYLE_EDEFAULT = Font_style.NORMAL;

	/**
	 * The cached value of the '{@link #getFont_style() <em>Font style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_style()
	 * @generated
	 * @ordered
	 */
	protected Font_style font_style = FONT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont_variant() <em>Font variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_variant()
	 * @generated
	 * @ordered
	 */
	protected static final Font_variant FONT_VARIANT_EDEFAULT = Font_variant.NORMAL;

	/**
	 * The cached value of the '{@link #getFont_variant() <em>Font variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_variant()
	 * @generated
	 * @ordered
	 */
	protected Font_variant font_variant = FONT_VARIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont_weight() <em>Font weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_weight()
	 * @generated
	 * @ordered
	 */
	protected static final Font_weight FONT_WEIGHT_EDEFAULT = Font_weight.NORMAL;

	/**
	 * The cached value of the '{@link #getFont_weight() <em>Font weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont_weight()
	 * @generated
	 * @ordered
	 */
	protected Font_weight font_weight = FONT_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlyph_orientation_horizontal() <em>Glyph orientation horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyph_orientation_horizontal()
	 * @generated
	 * @ordered
	 */
	protected static final String GLYPH_ORIENTATION_HORIZONTAL_EDEFAULT = "\"0deg\"";

	/**
	 * The cached value of the '{@link #getGlyph_orientation_horizontal() <em>Glyph orientation horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyph_orientation_horizontal()
	 * @generated
	 * @ordered
	 */
	protected String glyph_orientation_horizontal = GLYPH_ORIENTATION_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlyph_orientation_vertical() <em>Glyph orientation vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyph_orientation_vertical()
	 * @generated
	 * @ordered
	 */
	protected static final String GLYPH_ORIENTATION_VERTICAL_EDEFAULT = "\"auto\"";

	/**
	 * The cached value of the '{@link #getGlyph_orientation_vertical() <em>Glyph orientation vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyph_orientation_vertical()
	 * @generated
	 * @ordered
	 */
	protected String glyph_orientation_vertical = GLYPH_ORIENTATION_VERTICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_rendering() <em>Image rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_rendering()
	 * @generated
	 * @ordered
	 */
	protected static final Image_rendering IMAGE_RENDERING_EDEFAULT = Image_rendering.AUTO;

	/**
	 * The cached value of the '{@link #getImage_rendering() <em>Image rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_rendering()
	 * @generated
	 * @ordered
	 */
	protected Image_rendering image_rendering = IMAGE_RENDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getKerning() <em>Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerning()
	 * @generated
	 * @ordered
	 */
	protected static final String KERNING_EDEFAULT = "\"auto\"";

	/**
	 * The cached value of the '{@link #getKerning() <em>Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerning()
	 * @generated
	 * @ordered
	 */
	protected String kerning = KERNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLetter_spacing() <em>Letter spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter_spacing()
	 * @generated
	 * @ordered
	 */
	protected static final String LETTER_SPACING_EDEFAULT = "\"normal\"";

	/**
	 * The cached value of the '{@link #getLetter_spacing() <em>Letter spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter_spacing()
	 * @generated
	 * @ordered
	 */
	protected String letter_spacing = LETTER_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLighting_color() <em>Lighting color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLighting_color()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTING_COLOR_EDEFAULT = "\"white\"";

	/**
	 * The cached value of the '{@link #getLighting_color() <em>Lighting color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLighting_color()
	 * @generated
	 * @ordered
	 */
	protected String lighting_color = LIGHTING_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarker_end() <em>Marker end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker_end()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_END_EDEFAULT = "\"none\"";

	/**
	 * The cached value of the '{@link #getMarker_end() <em>Marker end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker_end()
	 * @generated
	 * @ordered
	 */
	protected String marker_end = MARKER_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarker_mid() <em>Marker mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker_mid()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_MID_EDEFAULT = "\"none\"";

	/**
	 * The cached value of the '{@link #getMarker_mid() <em>Marker mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker_mid()
	 * @generated
	 * @ordered
	 */
	protected String marker_mid = MARKER_MID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarker_start() <em>Marker start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker_start()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_START_EDEFAULT = "\"none\"";

	/**
	 * The cached value of the '{@link #getMarker_start() <em>Marker start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker_start()
	 * @generated
	 * @ordered
	 */
	protected String marker_start = MARKER_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasks() <em>Masks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasks()
	 * @generated
	 * @ordered
	 */
	protected static final String MASKS_EDEFAULT = "\"none\"";

	/**
	 * The cached value of the '{@link #getMasks() <em>Masks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasks()
	 * @generated
	 * @ordered
	 */
	protected String masks = MASKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String OPACITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected String opacity = OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverflow() <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverflow()
	 * @generated
	 * @ordered
	 */
	protected static final Overflow OVERFLOW_EDEFAULT = Overflow.VISIBLE;

	/**
	 * The cached value of the '{@link #getOverflow() <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverflow()
	 * @generated
	 * @ordered
	 */
	protected Overflow overflow = OVERFLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointer_events() <em>Pointer events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointer_events()
	 * @generated
	 * @ordered
	 */
	protected static final Pointer_events POINTER_EVENTS_EDEFAULT = Pointer_events.VISIBLE_PAINTED;

	/**
	 * The cached value of the '{@link #getPointer_events() <em>Pointer events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointer_events()
	 * @generated
	 * @ordered
	 */
	protected Pointer_events pointer_events = POINTER_EVENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShape_rendering() <em>Shape rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape_rendering()
	 * @generated
	 * @ordered
	 */
	protected static final Shape_rendering SHAPE_RENDERING_EDEFAULT = Shape_rendering.AUTO;

	/**
	 * The cached value of the '{@link #getShape_rendering() <em>Shape rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape_rendering()
	 * @generated
	 * @ordered
	 */
	protected Shape_rendering shape_rendering = SHAPE_RENDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getStop_color() <em>Stop color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop_color()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_COLOR_EDEFAULT = "black";

	/**
	 * The cached value of the '{@link #getStop_color() <em>Stop color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop_color()
	 * @generated
	 * @ordered
	 */
	protected String stop_color = STOP_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStop_opacity() <em>Stop opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop_opacity()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_OPACITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getStop_opacity() <em>Stop opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop_opacity()
	 * @generated
	 * @ordered
	 */
	protected String stop_opacity = STOP_OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected String stroke = STROKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke_dasharray() <em>Stroke dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_dasharray()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_DASHARRAY_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getStroke_dasharray() <em>Stroke dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_dasharray()
	 * @generated
	 * @ordered
	 */
	protected String stroke_dasharray = STROKE_DASHARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke_dashoffset() <em>Stroke dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_dashoffset()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_DASHOFFSET_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getStroke_dashoffset() <em>Stroke dashoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_dashoffset()
	 * @generated
	 * @ordered
	 */
	protected String stroke_dashoffset = STROKE_DASHOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke_linecap() <em>Stroke linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_linecap()
	 * @generated
	 * @ordered
	 */
	protected static final Stroke_linecap STROKE_LINECAP_EDEFAULT = Stroke_linecap.BUTT;

	/**
	 * The cached value of the '{@link #getStroke_linecap() <em>Stroke linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_linecap()
	 * @generated
	 * @ordered
	 */
	protected Stroke_linecap stroke_linecap = STROKE_LINECAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke_linejoin() <em>Stroke linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_linejoin()
	 * @generated
	 * @ordered
	 */
	protected static final Stroke_linejoin STROKE_LINEJOIN_EDEFAULT = Stroke_linejoin.MITER;

	/**
	 * The cached value of the '{@link #getStroke_linejoin() <em>Stroke linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_linejoin()
	 * @generated
	 * @ordered
	 */
	protected Stroke_linejoin stroke_linejoin = STROKE_LINEJOIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke_miterlimit() <em>Stroke miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_miterlimit()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_MITERLIMIT_EDEFAULT = "4";

	/**
	 * The cached value of the '{@link #getStroke_miterlimit() <em>Stroke miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_miterlimit()
	 * @generated
	 * @ordered
	 */
	protected String stroke_miterlimit = STROKE_MITERLIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke_opacity() <em>Stroke opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_opacity()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_OPACITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getStroke_opacity() <em>Stroke opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_opacity()
	 * @generated
	 * @ordered
	 */
	protected String stroke_opacity = STROKE_OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke_width() <em>Stroke width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_width()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_WIDTH_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getStroke_width() <em>Stroke width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke_width()
	 * @generated
	 * @ordered
	 */
	protected String stroke_width = STROKE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getText_anchor() <em>Text anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_anchor()
	 * @generated
	 * @ordered
	 */
	protected static final Text_anchor TEXT_ANCHOR_EDEFAULT = Text_anchor.START;

	/**
	 * The cached value of the '{@link #getText_anchor() <em>Text anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_anchor()
	 * @generated
	 * @ordered
	 */
	protected Text_anchor text_anchor = TEXT_ANCHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getText_decoration() <em>Text decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_decoration()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_DECORATION_EDEFAULT = "\"none\"";

	/**
	 * The cached value of the '{@link #getText_decoration() <em>Text decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_decoration()
	 * @generated
	 * @ordered
	 */
	protected String text_decoration = TEXT_DECORATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getText_rendering() <em>Text rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_rendering()
	 * @generated
	 * @ordered
	 */
	protected static final Text_rendering TEXT_RENDERING_EDEFAULT = Text_rendering.AUTO;

	/**
	 * The cached value of the '{@link #getText_rendering() <em>Text rendering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_rendering()
	 * @generated
	 * @ordered
	 */
	protected Text_rendering text_rendering = TEXT_RENDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnicode_bidi() <em>Unicode bidi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnicode_bidi()
	 * @generated
	 * @ordered
	 */
	protected static final Unicode_bidi UNICODE_BIDI_EDEFAULT = Unicode_bidi.NORMAL;

	/**
	 * The cached value of the '{@link #getUnicode_bidi() <em>Unicode bidi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnicode_bidi()
	 * @generated
	 * @ordered
	 */
	protected Unicode_bidi unicode_bidi = UNICODE_BIDI_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.VISIBLE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWord_spacing() <em>Word spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord_spacing()
	 * @generated
	 * @ordered
	 */
	protected static final String WORD_SPACING_EDEFAULT = "\"normal\"";

	/**
	 * The cached value of the '{@link #getWord_spacing() <em>Word spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord_spacing()
	 * @generated
	 * @ordered
	 */
	protected String word_spacing = WORD_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriting_mode() <em>Writing mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriting_mode()
	 * @generated
	 * @ordered
	 */
	protected static final Writing_mode WRITING_MODE_EDEFAULT = Writing_mode.LR_TB;

	/**
	 * The cached value of the '{@link #getWriting_mode() <em>Writing mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriting_mode()
	 * @generated
	 * @ordered
	 */
	protected Writing_mode writing_mode = WRITING_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXlink__href() <em>Xlink href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__href()
	 * @generated
	 * @ordered
	 */
	protected static final String XLINK_HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXlink__href() <em>Xlink href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__href()
	 * @generated
	 * @ordered
	 */
	protected String xlink__href = XLINK_HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getXlink__show() <em>Xlink show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__show()
	 * @generated
	 * @ordered
	 */
	protected static final String XLINK_SHOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXlink__show() <em>Xlink show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__show()
	 * @generated
	 * @ordered
	 */
	protected String xlink__show = XLINK_SHOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getXlink__actuate() <em>Xlink actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__actuate()
	 * @generated
	 * @ordered
	 */
	protected static final String XLINK_ACTUATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXlink__actuate() <em>Xlink actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__actuate()
	 * @generated
	 * @ordered
	 */
	protected String xlink__actuate = XLINK_ACTUATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXlink__type() <em>Xlink type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__type()
	 * @generated
	 * @ordered
	 */
	protected static final String XLINK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXlink__type() <em>Xlink type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__type()
	 * @generated
	 * @ordered
	 */
	protected String xlink__type = XLINK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXlink__role() <em>Xlink role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__role()
	 * @generated
	 * @ordered
	 */
	protected static final String XLINK_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXlink__role() <em>Xlink role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__role()
	 * @generated
	 * @ordered
	 */
	protected String xlink__role = XLINK_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXlink__arcrole() <em>Xlink arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__arcrole()
	 * @generated
	 * @ordered
	 */
	protected static final String XLINK_ARCROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXlink__arcrole() <em>Xlink arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__arcrole()
	 * @generated
	 * @ordered
	 */
	protected String xlink__arcrole = XLINK_ARCROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXlink__title() <em>Xlink title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__title()
	 * @generated
	 * @ordered
	 */
	protected static final String XLINK_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXlink__title() <em>Xlink title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXlink__title()
	 * @generated
	 * @ordered
	 */
	protected String xlink__title = XLINK_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResolvedInstance() <em>Resolved Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedInstance()
	 * @generated
	 * @ordered
	 */
	protected SvgElement resolvedInstance;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<SvgElement> children;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalResourcesRequired() <em>External Resources Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalResourcesRequired()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_RESOURCES_REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalResourcesRequired() <em>External Resources Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalResourcesRequired()
	 * @generated
	 * @ordered
	 */
	protected String externalResourcesRequired = EXTERNAL_RESOURCES_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final String CX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected String cx = CX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final String CY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected String cy = CY_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final String R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected String r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getFx() <em>Fx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx()
	 * @generated
	 * @ordered
	 */
	protected static final String FX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFx() <em>Fx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx()
	 * @generated
	 * @ordered
	 */
	protected String fx = FX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFy() <em>Fy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFy()
	 * @generated
	 * @ordered
	 */
	protected static final String FY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFy() <em>Fy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFy()
	 * @generated
	 * @ordered
	 */
	protected String fy = FY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected static final SpreadMethod SPREAD_METHOD_EDEFAULT = SpreadMethod.PAD;

	/**
	 * The cached value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected SpreadMethod spreadMethod = SPREAD_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientUnits() <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnits()
	 * @generated
	 * @ordered
	 */
	protected static final GradientUnits GRADIENT_UNITS_EDEFAULT = GradientUnits.USER_SPACE_ON_USE;

	/**
	 * The cached value of the '{@link #getGradientUnits() <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnits()
	 * @generated
	 * @ordered
	 */
	protected GradientUnits gradientUnits = GRADIENT_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientTransform() <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADIENT_TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradientTransform() <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTransform()
	 * @generated
	 * @ordered
	 */
	protected String gradientTransform = GRADIENT_TRANSFORM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvgRadialGradientElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.SVG_RADIAL_GRADIENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXml__base() {
		return xml__base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml__base(String newXml__base) {
		String oldXml__base = xml__base;
		xml__base = newXml__base;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_BASE, oldXml__base, xml__base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXml__lang() {
		return xml__lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml__lang(String newXml__lang) {
		String oldXml__lang = xml__lang;
		xml__lang = newXml__lang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_LANG, oldXml__lang, xml__lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXml__space() {
		return xml__space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml__space(String newXml__space) {
		String oldXml__space = xml__space;
		xml__space = newXml__space;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_SPACE, oldXml__space, xml__space));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment_baseline getAlignment_baseline() {
		return alignment_baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment_baseline(Alignment_baseline newAlignment_baseline) {
		Alignment_baseline oldAlignment_baseline = alignment_baseline;
		alignment_baseline = newAlignment_baseline == null ? ALIGNMENT_BASELINE_EDEFAULT : newAlignment_baseline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ALIGNMENT_BASELINE, oldAlignment_baseline, alignment_baseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseline_shift() {
		return baseline_shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseline_shift(String newBaseline_shift) {
		String oldBaseline_shift = baseline_shift;
		baseline_shift = newBaseline_shift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__BASELINE_SHIFT, oldBaseline_shift, baseline_shift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClip() {
		return clip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClip(String newClip) {
		String oldClip = clip;
		clip = newClip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP, oldClip, clip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClip_path() {
		return clip_path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClip_path(String newClip_path) {
		String oldClip_path = clip_path;
		clip_path = newClip_path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_PATH, oldClip_path, clip_path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clip_rule getClip_rule() {
		return clip_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClip_rule(Clip_rule newClip_rule) {
		Clip_rule oldClip_rule = clip_rule;
		clip_rule = newClip_rule == null ? CLIP_RULE_EDEFAULT : newClip_rule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_RULE, oldClip_rule, clip_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color_interpolation getColor_interpolation() {
		return color_interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor_interpolation(Color_interpolation newColor_interpolation) {
		Color_interpolation oldColor_interpolation = color_interpolation;
		color_interpolation = newColor_interpolation == null ? COLOR_INTERPOLATION_EDEFAULT : newColor_interpolation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION, oldColor_interpolation, color_interpolation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color_interpolation_filters getColor_interpolation_filters() {
		return color_interpolation_filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor_interpolation_filters(Color_interpolation_filters newColor_interpolation_filters) {
		Color_interpolation_filters oldColor_interpolation_filters = color_interpolation_filters;
		color_interpolation_filters = newColor_interpolation_filters == null ? COLOR_INTERPOLATION_FILTERS_EDEFAULT : newColor_interpolation_filters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION_FILTERS, oldColor_interpolation_filters, color_interpolation_filters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor_profile() {
		return color_profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor_profile(String newColor_profile) {
		String oldColor_profile = color_profile;
		color_profile = newColor_profile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_PROFILE, oldColor_profile, color_profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color_rendering getColor_rendering() {
		return color_rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor_rendering(Color_rendering newColor_rendering) {
		Color_rendering oldColor_rendering = color_rendering;
		color_rendering = newColor_rendering == null ? COLOR_RENDERING_EDEFAULT : newColor_rendering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_RENDERING, oldColor_rendering, color_rendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCursor() {
		return cursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursor(String newCursor) {
		String oldCursor = cursor;
		cursor = newCursor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CURSOR, oldCursor, cursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(Display newDisplay) {
		Display oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dominant_baseline getDominant_baseline() {
		return dominant_baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDominant_baseline(Dominant_baseline newDominant_baseline) {
		Dominant_baseline oldDominant_baseline = dominant_baseline;
		dominant_baseline = newDominant_baseline == null ? DOMINANT_BASELINE_EDEFAULT : newDominant_baseline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DOMINANT_BASELINE, oldDominant_baseline, dominant_baseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnable_background() {
		return enable_background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable_background(String newEnable_background) {
		String oldEnable_background = enable_background;
		enable_background = newEnable_background;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ENABLE_BACKGROUND, oldEnable_background, enable_background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(String newFill) {
		String oldFill = fill;
		fill = newFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL, oldFill, fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFill_opacity() {
		return fill_opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill_opacity(String newFill_opacity) {
		String oldFill_opacity = fill_opacity;
		fill_opacity = newFill_opacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_OPACITY, oldFill_opacity, fill_opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fill_rule getFill_rule() {
		return fill_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill_rule(Fill_rule newFill_rule) {
		Fill_rule oldFill_rule = fill_rule;
		fill_rule = newFill_rule == null ? FILL_RULE_EDEFAULT : newFill_rule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_RULE, oldFill_rule, fill_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlood_color() {
		return flood_color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlood_color(String newFlood_color) {
		String oldFlood_color = flood_color;
		flood_color = newFlood_color;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_COLOR, oldFlood_color, flood_color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlood_opacity() {
		return flood_opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlood_opacity(String newFlood_opacity) {
		String oldFlood_opacity = flood_opacity;
		flood_opacity = newFlood_opacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_OPACITY, oldFlood_opacity, flood_opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont_family() {
		return font_family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont_family(String newFont_family) {
		String oldFont_family = font_family;
		font_family = newFont_family;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_FAMILY, oldFont_family, font_family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont_size() {
		return font_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont_size(String newFont_size) {
		String oldFont_size = font_size;
		font_size = newFont_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE, oldFont_size, font_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont_size_adjust() {
		return font_size_adjust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont_size_adjust(String newFont_size_adjust) {
		String oldFont_size_adjust = font_size_adjust;
		font_size_adjust = newFont_size_adjust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE_ADJUST, oldFont_size_adjust, font_size_adjust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font_stretch getFont_stretch() {
		return font_stretch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont_stretch(Font_stretch newFont_stretch) {
		Font_stretch oldFont_stretch = font_stretch;
		font_stretch = newFont_stretch == null ? FONT_STRETCH_EDEFAULT : newFont_stretch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STRETCH, oldFont_stretch, font_stretch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font_style getFont_style() {
		return font_style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont_style(Font_style newFont_style) {
		Font_style oldFont_style = font_style;
		font_style = newFont_style == null ? FONT_STYLE_EDEFAULT : newFont_style;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STYLE, oldFont_style, font_style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font_variant getFont_variant() {
		return font_variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont_variant(Font_variant newFont_variant) {
		Font_variant oldFont_variant = font_variant;
		font_variant = newFont_variant == null ? FONT_VARIANT_EDEFAULT : newFont_variant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_VARIANT, oldFont_variant, font_variant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font_weight getFont_weight() {
		return font_weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont_weight(Font_weight newFont_weight) {
		Font_weight oldFont_weight = font_weight;
		font_weight = newFont_weight == null ? FONT_WEIGHT_EDEFAULT : newFont_weight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_WEIGHT, oldFont_weight, font_weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlyph_orientation_horizontal() {
		return glyph_orientation_horizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlyph_orientation_horizontal(String newGlyph_orientation_horizontal) {
		String oldGlyph_orientation_horizontal = glyph_orientation_horizontal;
		glyph_orientation_horizontal = newGlyph_orientation_horizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_HORIZONTAL, oldGlyph_orientation_horizontal, glyph_orientation_horizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlyph_orientation_vertical() {
		return glyph_orientation_vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlyph_orientation_vertical(String newGlyph_orientation_vertical) {
		String oldGlyph_orientation_vertical = glyph_orientation_vertical;
		glyph_orientation_vertical = newGlyph_orientation_vertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_VERTICAL, oldGlyph_orientation_vertical, glyph_orientation_vertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image_rendering getImage_rendering() {
		return image_rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_rendering(Image_rendering newImage_rendering) {
		Image_rendering oldImage_rendering = image_rendering;
		image_rendering = newImage_rendering == null ? IMAGE_RENDERING_EDEFAULT : newImage_rendering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__IMAGE_RENDERING, oldImage_rendering, image_rendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKerning() {
		return kerning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKerning(String newKerning) {
		String oldKerning = kerning;
		kerning = newKerning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__KERNING, oldKerning, kerning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLetter_spacing() {
		return letter_spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetter_spacing(String newLetter_spacing) {
		String oldLetter_spacing = letter_spacing;
		letter_spacing = newLetter_spacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LETTER_SPACING, oldLetter_spacing, letter_spacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLighting_color() {
		return lighting_color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLighting_color(String newLighting_color) {
		String oldLighting_color = lighting_color;
		lighting_color = newLighting_color;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LIGHTING_COLOR, oldLighting_color, lighting_color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarker_end() {
		return marker_end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarker_end(String newMarker_end) {
		String oldMarker_end = marker_end;
		marker_end = newMarker_end;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_END, oldMarker_end, marker_end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarker_mid() {
		return marker_mid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarker_mid(String newMarker_mid) {
		String oldMarker_mid = marker_mid;
		marker_mid = newMarker_mid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_MID, oldMarker_mid, marker_mid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarker_start() {
		return marker_start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarker_start(String newMarker_start) {
		String oldMarker_start = marker_start;
		marker_start = newMarker_start;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_START, oldMarker_start, marker_start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasks() {
		return masks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasks(String newMasks) {
		String oldMasks = masks;
		masks = newMasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MASKS, oldMasks, masks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(String newOpacity) {
		String oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overflow getOverflow() {
		return overflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverflow(Overflow newOverflow) {
		Overflow oldOverflow = overflow;
		overflow = newOverflow == null ? OVERFLOW_EDEFAULT : newOverflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OVERFLOW, oldOverflow, overflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointer_events getPointer_events() {
		return pointer_events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointer_events(Pointer_events newPointer_events) {
		Pointer_events oldPointer_events = pointer_events;
		pointer_events = newPointer_events == null ? POINTER_EVENTS_EDEFAULT : newPointer_events;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__POINTER_EVENTS, oldPointer_events, pointer_events));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape_rendering getShape_rendering() {
		return shape_rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape_rendering(Shape_rendering newShape_rendering) {
		Shape_rendering oldShape_rendering = shape_rendering;
		shape_rendering = newShape_rendering == null ? SHAPE_RENDERING_EDEFAULT : newShape_rendering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SHAPE_RENDERING, oldShape_rendering, shape_rendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStop_color() {
		return stop_color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop_color(String newStop_color) {
		String oldStop_color = stop_color;
		stop_color = newStop_color;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_COLOR, oldStop_color, stop_color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStop_opacity() {
		return stop_opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop_opacity(String newStop_opacity) {
		String oldStop_opacity = stop_opacity;
		stop_opacity = newStop_opacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_OPACITY, oldStop_opacity, stop_opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(String newStroke) {
		String oldStroke = stroke;
		stroke = newStroke;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE, oldStroke, stroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke_dasharray() {
		return stroke_dasharray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke_dasharray(String newStroke_dasharray) {
		String oldStroke_dasharray = stroke_dasharray;
		stroke_dasharray = newStroke_dasharray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHARRAY, oldStroke_dasharray, stroke_dasharray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke_dashoffset() {
		return stroke_dashoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke_dashoffset(String newStroke_dashoffset) {
		String oldStroke_dashoffset = stroke_dashoffset;
		stroke_dashoffset = newStroke_dashoffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHOFFSET, oldStroke_dashoffset, stroke_dashoffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stroke_linecap getStroke_linecap() {
		return stroke_linecap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke_linecap(Stroke_linecap newStroke_linecap) {
		Stroke_linecap oldStroke_linecap = stroke_linecap;
		stroke_linecap = newStroke_linecap == null ? STROKE_LINECAP_EDEFAULT : newStroke_linecap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINECAP, oldStroke_linecap, stroke_linecap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stroke_linejoin getStroke_linejoin() {
		return stroke_linejoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke_linejoin(Stroke_linejoin newStroke_linejoin) {
		Stroke_linejoin oldStroke_linejoin = stroke_linejoin;
		stroke_linejoin = newStroke_linejoin == null ? STROKE_LINEJOIN_EDEFAULT : newStroke_linejoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINEJOIN, oldStroke_linejoin, stroke_linejoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke_miterlimit() {
		return stroke_miterlimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke_miterlimit(String newStroke_miterlimit) {
		String oldStroke_miterlimit = stroke_miterlimit;
		stroke_miterlimit = newStroke_miterlimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_MITERLIMIT, oldStroke_miterlimit, stroke_miterlimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke_opacity() {
		return stroke_opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke_opacity(String newStroke_opacity) {
		String oldStroke_opacity = stroke_opacity;
		stroke_opacity = newStroke_opacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_OPACITY, oldStroke_opacity, stroke_opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke_width() {
		return stroke_width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke_width(String newStroke_width) {
		String oldStroke_width = stroke_width;
		stroke_width = newStroke_width;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_WIDTH, oldStroke_width, stroke_width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text_anchor getText_anchor() {
		return text_anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText_anchor(Text_anchor newText_anchor) {
		Text_anchor oldText_anchor = text_anchor;
		text_anchor = newText_anchor == null ? TEXT_ANCHOR_EDEFAULT : newText_anchor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_ANCHOR, oldText_anchor, text_anchor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText_decoration() {
		return text_decoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText_decoration(String newText_decoration) {
		String oldText_decoration = text_decoration;
		text_decoration = newText_decoration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_DECORATION, oldText_decoration, text_decoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text_rendering getText_rendering() {
		return text_rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText_rendering(Text_rendering newText_rendering) {
		Text_rendering oldText_rendering = text_rendering;
		text_rendering = newText_rendering == null ? TEXT_RENDERING_EDEFAULT : newText_rendering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_RENDERING, oldText_rendering, text_rendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unicode_bidi getUnicode_bidi() {
		return unicode_bidi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnicode_bidi(Unicode_bidi newUnicode_bidi) {
		Unicode_bidi oldUnicode_bidi = unicode_bidi;
		unicode_bidi = newUnicode_bidi == null ? UNICODE_BIDI_EDEFAULT : newUnicode_bidi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__UNICODE_BIDI, oldUnicode_bidi, unicode_bidi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWord_spacing() {
		return word_spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWord_spacing(String newWord_spacing) {
		String oldWord_spacing = word_spacing;
		word_spacing = newWord_spacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WORD_SPACING, oldWord_spacing, word_spacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writing_mode getWriting_mode() {
		return writing_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriting_mode(Writing_mode newWriting_mode) {
		Writing_mode oldWriting_mode = writing_mode;
		writing_mode = newWriting_mode == null ? WRITING_MODE_EDEFAULT : newWriting_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WRITING_MODE, oldWriting_mode, writing_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlink__href() {
		return xlink__href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlink__href(String newXlink__href) {
		String oldXlink__href = xlink__href;
		xlink__href = newXlink__href;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_HREF, oldXlink__href, xlink__href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlink__show() {
		return xlink__show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlink__show(String newXlink__show) {
		String oldXlink__show = xlink__show;
		xlink__show = newXlink__show;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_SHOW, oldXlink__show, xlink__show));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlink__actuate() {
		return xlink__actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlink__actuate(String newXlink__actuate) {
		String oldXlink__actuate = xlink__actuate;
		xlink__actuate = newXlink__actuate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ACTUATE, oldXlink__actuate, xlink__actuate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlink__type() {
		return xlink__type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlink__type(String newXlink__type) {
		String oldXlink__type = xlink__type;
		xlink__type = newXlink__type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TYPE, oldXlink__type, xlink__type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlink__role() {
		return xlink__role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlink__role(String newXlink__role) {
		String oldXlink__role = xlink__role;
		xlink__role = newXlink__role;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ROLE, oldXlink__role, xlink__role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlink__arcrole() {
		return xlink__arcrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlink__arcrole(String newXlink__arcrole) {
		String oldXlink__arcrole = xlink__arcrole;
		xlink__arcrole = newXlink__arcrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ARCROLE, oldXlink__arcrole, xlink__arcrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXlink__title() {
		return xlink__title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXlink__title(String newXlink__title) {
		String oldXlink__title = xlink__title;
		xlink__title = newXlink__title;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TITLE, oldXlink__title, xlink__title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgElement getResolvedInstance() {
		if (resolvedInstance != null && resolvedInstance.eIsProxy()) {
			InternalEObject oldResolvedInstance = (InternalEObject)resolvedInstance;
			resolvedInstance = (SvgElement)eResolveProxy(oldResolvedInstance);
			if (resolvedInstance != oldResolvedInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__RESOLVED_INSTANCE, oldResolvedInstance, resolvedInstance));
			}
		}
		return resolvedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgElement basicGetResolvedInstance() {
		return resolvedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedInstance(SvgElement newResolvedInstance) {
		SvgElement oldResolvedInstance = resolvedInstance;
		resolvedInstance = newResolvedInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__RESOLVED_INSTANCE, oldResolvedInstance, resolvedInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SvgElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<SvgElement>(SvgElement.class, this, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalResourcesRequired() {
		return externalResourcesRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalResourcesRequired(String newExternalResourcesRequired) {
		String oldExternalResourcesRequired = externalResourcesRequired;
		externalResourcesRequired = newExternalResourcesRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__EXTERNAL_RESOURCES_REQUIRED, oldExternalResourcesRequired, externalResourcesRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCx() {
		return cx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(String newCx) {
		String oldCx = cx;
		cx = newCx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CX, oldCx, cx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCy() {
		return cy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(String newCy) {
		String oldCy = cy;
		cy = newCy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CY, oldCy, cy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(String newR) {
		String oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFx() {
		return fx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFx(String newFx) {
		String oldFx = fx;
		fx = newFx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FX, oldFx, fx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFy() {
		return fy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFy(String newFy) {
		String oldFy = fy;
		fy = newFy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FY, oldFy, fy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadMethod getSpreadMethod() {
		return spreadMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadMethod(SpreadMethod newSpreadMethod) {
		SpreadMethod oldSpreadMethod = spreadMethod;
		spreadMethod = newSpreadMethod == null ? SPREAD_METHOD_EDEFAULT : newSpreadMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SPREAD_METHOD, oldSpreadMethod, spreadMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientUnits getGradientUnits() {
		return gradientUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientUnits(GradientUnits newGradientUnits) {
		GradientUnits oldGradientUnits = gradientUnits;
		gradientUnits = newGradientUnits == null ? GRADIENT_UNITS_EDEFAULT : newGradientUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_UNITS, oldGradientUnits, gradientUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGradientTransform() {
		return gradientTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientTransform(String newGradientTransform) {
		String oldGradientTransform = gradientTransform;
		gradientTransform = newGradientTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_TRANSFORM, oldGradientTransform, gradientTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ID:
				return getId();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_BASE:
				return getXml__base();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_LANG:
				return getXml__lang();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_SPACE:
				return getXml__space();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ALIGNMENT_BASELINE:
				return getAlignment_baseline();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__BASELINE_SHIFT:
				return getBaseline_shift();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP:
				return getClip();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_PATH:
				return getClip_path();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_RULE:
				return getClip_rule();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR:
				return getColor();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION:
				return getColor_interpolation();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION_FILTERS:
				return getColor_interpolation_filters();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_PROFILE:
				return getColor_profile();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_RENDERING:
				return getColor_rendering();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CURSOR:
				return getCursor();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DIRECTION:
				return getDirection();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DISPLAY:
				return getDisplay();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DOMINANT_BASELINE:
				return getDominant_baseline();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ENABLE_BACKGROUND:
				return getEnable_background();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL:
				return getFill();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_OPACITY:
				return getFill_opacity();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_RULE:
				return getFill_rule();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILTER:
				return getFilter();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_COLOR:
				return getFlood_color();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_OPACITY:
				return getFlood_opacity();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_FAMILY:
				return getFont_family();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE:
				return getFont_size();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE_ADJUST:
				return getFont_size_adjust();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STRETCH:
				return getFont_stretch();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STYLE:
				return getFont_style();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_VARIANT:
				return getFont_variant();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_WEIGHT:
				return getFont_weight();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_HORIZONTAL:
				return getGlyph_orientation_horizontal();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_VERTICAL:
				return getGlyph_orientation_vertical();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__IMAGE_RENDERING:
				return getImage_rendering();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__KERNING:
				return getKerning();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LETTER_SPACING:
				return getLetter_spacing();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LIGHTING_COLOR:
				return getLighting_color();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_END:
				return getMarker_end();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_MID:
				return getMarker_mid();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_START:
				return getMarker_start();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MASKS:
				return getMasks();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OPACITY:
				return getOpacity();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OVERFLOW:
				return getOverflow();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__POINTER_EVENTS:
				return getPointer_events();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SHAPE_RENDERING:
				return getShape_rendering();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_COLOR:
				return getStop_color();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_OPACITY:
				return getStop_opacity();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE:
				return getStroke();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHARRAY:
				return getStroke_dasharray();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHOFFSET:
				return getStroke_dashoffset();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINECAP:
				return getStroke_linecap();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINEJOIN:
				return getStroke_linejoin();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_MITERLIMIT:
				return getStroke_miterlimit();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_OPACITY:
				return getStroke_opacity();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_WIDTH:
				return getStroke_width();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_ANCHOR:
				return getText_anchor();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_DECORATION:
				return getText_decoration();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_RENDERING:
				return getText_rendering();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__UNICODE_BIDI:
				return getUnicode_bidi();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__VISIBILITY:
				return getVisibility();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WORD_SPACING:
				return getWord_spacing();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WRITING_MODE:
				return getWriting_mode();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_HREF:
				return getXlink__href();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_SHOW:
				return getXlink__show();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ACTUATE:
				return getXlink__actuate();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TYPE:
				return getXlink__type();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ROLE:
				return getXlink__role();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ARCROLE:
				return getXlink__arcrole();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TITLE:
				return getXlink__title();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__RESOLVED_INSTANCE:
				if (resolve) return getResolvedInstance();
				return basicGetResolvedInstance();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CHILDREN:
				return getChildren();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLASS:
				return getClass_();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STYLE:
				return getStyle();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__EXTERNAL_RESOURCES_REQUIRED:
				return getExternalResourcesRequired();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CX:
				return getCx();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CY:
				return getCy();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__R:
				return getR();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FX:
				return getFx();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FY:
				return getFy();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SPREAD_METHOD:
				return getSpreadMethod();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_UNITS:
				return getGradientUnits();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_TRANSFORM:
				return getGradientTransform();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ID:
				setId((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_BASE:
				setXml__base((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_LANG:
				setXml__lang((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_SPACE:
				setXml__space((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ALIGNMENT_BASELINE:
				setAlignment_baseline((Alignment_baseline)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__BASELINE_SHIFT:
				setBaseline_shift((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP:
				setClip((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_PATH:
				setClip_path((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_RULE:
				setClip_rule((Clip_rule)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR:
				setColor((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION:
				setColor_interpolation((Color_interpolation)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION_FILTERS:
				setColor_interpolation_filters((Color_interpolation_filters)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_PROFILE:
				setColor_profile((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_RENDERING:
				setColor_rendering((Color_rendering)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CURSOR:
				setCursor((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DISPLAY:
				setDisplay((Display)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DOMINANT_BASELINE:
				setDominant_baseline((Dominant_baseline)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ENABLE_BACKGROUND:
				setEnable_background((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL:
				setFill((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_OPACITY:
				setFill_opacity((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_RULE:
				setFill_rule((Fill_rule)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILTER:
				setFilter((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_COLOR:
				setFlood_color((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_OPACITY:
				setFlood_opacity((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_FAMILY:
				setFont_family((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE:
				setFont_size((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE_ADJUST:
				setFont_size_adjust((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STRETCH:
				setFont_stretch((Font_stretch)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STYLE:
				setFont_style((Font_style)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_VARIANT:
				setFont_variant((Font_variant)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_WEIGHT:
				setFont_weight((Font_weight)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_HORIZONTAL:
				setGlyph_orientation_horizontal((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_VERTICAL:
				setGlyph_orientation_vertical((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__IMAGE_RENDERING:
				setImage_rendering((Image_rendering)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__KERNING:
				setKerning((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LETTER_SPACING:
				setLetter_spacing((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LIGHTING_COLOR:
				setLighting_color((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_END:
				setMarker_end((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_MID:
				setMarker_mid((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_START:
				setMarker_start((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MASKS:
				setMasks((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OPACITY:
				setOpacity((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OVERFLOW:
				setOverflow((Overflow)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__POINTER_EVENTS:
				setPointer_events((Pointer_events)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SHAPE_RENDERING:
				setShape_rendering((Shape_rendering)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_COLOR:
				setStop_color((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_OPACITY:
				setStop_opacity((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE:
				setStroke((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHARRAY:
				setStroke_dasharray((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHOFFSET:
				setStroke_dashoffset((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINECAP:
				setStroke_linecap((Stroke_linecap)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINEJOIN:
				setStroke_linejoin((Stroke_linejoin)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_MITERLIMIT:
				setStroke_miterlimit((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_OPACITY:
				setStroke_opacity((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_WIDTH:
				setStroke_width((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_ANCHOR:
				setText_anchor((Text_anchor)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_DECORATION:
				setText_decoration((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_RENDERING:
				setText_rendering((Text_rendering)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__UNICODE_BIDI:
				setUnicode_bidi((Unicode_bidi)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WORD_SPACING:
				setWord_spacing((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WRITING_MODE:
				setWriting_mode((Writing_mode)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_HREF:
				setXlink__href((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_SHOW:
				setXlink__show((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ACTUATE:
				setXlink__actuate((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TYPE:
				setXlink__type((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ROLE:
				setXlink__role((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ARCROLE:
				setXlink__arcrole((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TITLE:
				setXlink__title((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__RESOLVED_INSTANCE:
				setResolvedInstance((SvgElement)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends SvgElement>)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLASS:
				setClass((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STYLE:
				setStyle((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__EXTERNAL_RESOURCES_REQUIRED:
				setExternalResourcesRequired((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CX:
				setCx((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CY:
				setCy((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__R:
				setR((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FX:
				setFx((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FY:
				setFy((String)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SPREAD_METHOD:
				setSpreadMethod((SpreadMethod)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_UNITS:
				setGradientUnits((GradientUnits)newValue);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_TRANSFORM:
				setGradientTransform((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_BASE:
				setXml__base(XML_BASE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_LANG:
				setXml__lang(XML_LANG_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_SPACE:
				setXml__space(XML_SPACE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ALIGNMENT_BASELINE:
				setAlignment_baseline(ALIGNMENT_BASELINE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__BASELINE_SHIFT:
				setBaseline_shift(BASELINE_SHIFT_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP:
				setClip(CLIP_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_PATH:
				setClip_path(CLIP_PATH_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_RULE:
				setClip_rule(CLIP_RULE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION:
				setColor_interpolation(COLOR_INTERPOLATION_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION_FILTERS:
				setColor_interpolation_filters(COLOR_INTERPOLATION_FILTERS_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_PROFILE:
				setColor_profile(COLOR_PROFILE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_RENDERING:
				setColor_rendering(COLOR_RENDERING_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CURSOR:
				setCursor(CURSOR_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DISPLAY:
				setDisplay(DISPLAY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DOMINANT_BASELINE:
				setDominant_baseline(DOMINANT_BASELINE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ENABLE_BACKGROUND:
				setEnable_background(ENABLE_BACKGROUND_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_OPACITY:
				setFill_opacity(FILL_OPACITY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_RULE:
				setFill_rule(FILL_RULE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_COLOR:
				setFlood_color(FLOOD_COLOR_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_OPACITY:
				setFlood_opacity(FLOOD_OPACITY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_FAMILY:
				setFont_family(FONT_FAMILY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE:
				setFont_size(FONT_SIZE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE_ADJUST:
				setFont_size_adjust(FONT_SIZE_ADJUST_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STRETCH:
				setFont_stretch(FONT_STRETCH_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STYLE:
				setFont_style(FONT_STYLE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_VARIANT:
				setFont_variant(FONT_VARIANT_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_WEIGHT:
				setFont_weight(FONT_WEIGHT_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_HORIZONTAL:
				setGlyph_orientation_horizontal(GLYPH_ORIENTATION_HORIZONTAL_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_VERTICAL:
				setGlyph_orientation_vertical(GLYPH_ORIENTATION_VERTICAL_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__IMAGE_RENDERING:
				setImage_rendering(IMAGE_RENDERING_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__KERNING:
				setKerning(KERNING_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LETTER_SPACING:
				setLetter_spacing(LETTER_SPACING_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LIGHTING_COLOR:
				setLighting_color(LIGHTING_COLOR_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_END:
				setMarker_end(MARKER_END_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_MID:
				setMarker_mid(MARKER_MID_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_START:
				setMarker_start(MARKER_START_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MASKS:
				setMasks(MASKS_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OVERFLOW:
				setOverflow(OVERFLOW_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__POINTER_EVENTS:
				setPointer_events(POINTER_EVENTS_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SHAPE_RENDERING:
				setShape_rendering(SHAPE_RENDERING_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_COLOR:
				setStop_color(STOP_COLOR_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_OPACITY:
				setStop_opacity(STOP_OPACITY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE:
				setStroke(STROKE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHARRAY:
				setStroke_dasharray(STROKE_DASHARRAY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHOFFSET:
				setStroke_dashoffset(STROKE_DASHOFFSET_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINECAP:
				setStroke_linecap(STROKE_LINECAP_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINEJOIN:
				setStroke_linejoin(STROKE_LINEJOIN_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_MITERLIMIT:
				setStroke_miterlimit(STROKE_MITERLIMIT_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_OPACITY:
				setStroke_opacity(STROKE_OPACITY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_WIDTH:
				setStroke_width(STROKE_WIDTH_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_ANCHOR:
				setText_anchor(TEXT_ANCHOR_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_DECORATION:
				setText_decoration(TEXT_DECORATION_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_RENDERING:
				setText_rendering(TEXT_RENDERING_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__UNICODE_BIDI:
				setUnicode_bidi(UNICODE_BIDI_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WORD_SPACING:
				setWord_spacing(WORD_SPACING_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WRITING_MODE:
				setWriting_mode(WRITING_MODE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_HREF:
				setXlink__href(XLINK_HREF_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_SHOW:
				setXlink__show(XLINK_SHOW_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ACTUATE:
				setXlink__actuate(XLINK_ACTUATE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TYPE:
				setXlink__type(XLINK_TYPE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ROLE:
				setXlink__role(XLINK_ROLE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ARCROLE:
				setXlink__arcrole(XLINK_ARCROLE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TITLE:
				setXlink__title(XLINK_TITLE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__RESOLVED_INSTANCE:
				setResolvedInstance((SvgElement)null);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CHILDREN:
				getChildren().clear();
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__EXTERNAL_RESOURCES_REQUIRED:
				setExternalResourcesRequired(EXTERNAL_RESOURCES_REQUIRED_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CX:
				setCx(CX_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CY:
				setCy(CY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__R:
				setR(R_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FX:
				setFx(FX_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FY:
				setFy(FY_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SPREAD_METHOD:
				setSpreadMethod(SPREAD_METHOD_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_UNITS:
				setGradientUnits(GRADIENT_UNITS_EDEFAULT);
				return;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_TRANSFORM:
				setGradientTransform(GRADIENT_TRANSFORM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_BASE:
				return XML_BASE_EDEFAULT == null ? xml__base != null : !XML_BASE_EDEFAULT.equals(xml__base);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_LANG:
				return XML_LANG_EDEFAULT == null ? xml__lang != null : !XML_LANG_EDEFAULT.equals(xml__lang);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_SPACE:
				return XML_SPACE_EDEFAULT == null ? xml__space != null : !XML_SPACE_EDEFAULT.equals(xml__space);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ALIGNMENT_BASELINE:
				return alignment_baseline != ALIGNMENT_BASELINE_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__BASELINE_SHIFT:
				return BASELINE_SHIFT_EDEFAULT == null ? baseline_shift != null : !BASELINE_SHIFT_EDEFAULT.equals(baseline_shift);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP:
				return CLIP_EDEFAULT == null ? clip != null : !CLIP_EDEFAULT.equals(clip);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_PATH:
				return CLIP_PATH_EDEFAULT == null ? clip_path != null : !CLIP_PATH_EDEFAULT.equals(clip_path);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_RULE:
				return clip_rule != CLIP_RULE_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION:
				return color_interpolation != COLOR_INTERPOLATION_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION_FILTERS:
				return color_interpolation_filters != COLOR_INTERPOLATION_FILTERS_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_PROFILE:
				return COLOR_PROFILE_EDEFAULT == null ? color_profile != null : !COLOR_PROFILE_EDEFAULT.equals(color_profile);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_RENDERING:
				return color_rendering != COLOR_RENDERING_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CURSOR:
				return CURSOR_EDEFAULT == null ? cursor != null : !CURSOR_EDEFAULT.equals(cursor);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DISPLAY:
				return display != DISPLAY_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DOMINANT_BASELINE:
				return dominant_baseline != DOMINANT_BASELINE_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ENABLE_BACKGROUND:
				return ENABLE_BACKGROUND_EDEFAULT == null ? enable_background != null : !ENABLE_BACKGROUND_EDEFAULT.equals(enable_background);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL:
				return FILL_EDEFAULT == null ? fill != null : !FILL_EDEFAULT.equals(fill);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_OPACITY:
				return FILL_OPACITY_EDEFAULT == null ? fill_opacity != null : !FILL_OPACITY_EDEFAULT.equals(fill_opacity);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_RULE:
				return fill_rule != FILL_RULE_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_COLOR:
				return FLOOD_COLOR_EDEFAULT == null ? flood_color != null : !FLOOD_COLOR_EDEFAULT.equals(flood_color);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_OPACITY:
				return FLOOD_OPACITY_EDEFAULT == null ? flood_opacity != null : !FLOOD_OPACITY_EDEFAULT.equals(flood_opacity);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? font_family != null : !FONT_FAMILY_EDEFAULT.equals(font_family);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? font_size != null : !FONT_SIZE_EDEFAULT.equals(font_size);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE_ADJUST:
				return FONT_SIZE_ADJUST_EDEFAULT == null ? font_size_adjust != null : !FONT_SIZE_ADJUST_EDEFAULT.equals(font_size_adjust);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STRETCH:
				return font_stretch != FONT_STRETCH_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STYLE:
				return font_style != FONT_STYLE_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_VARIANT:
				return font_variant != FONT_VARIANT_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_WEIGHT:
				return font_weight != FONT_WEIGHT_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_HORIZONTAL:
				return GLYPH_ORIENTATION_HORIZONTAL_EDEFAULT == null ? glyph_orientation_horizontal != null : !GLYPH_ORIENTATION_HORIZONTAL_EDEFAULT.equals(glyph_orientation_horizontal);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_VERTICAL:
				return GLYPH_ORIENTATION_VERTICAL_EDEFAULT == null ? glyph_orientation_vertical != null : !GLYPH_ORIENTATION_VERTICAL_EDEFAULT.equals(glyph_orientation_vertical);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__IMAGE_RENDERING:
				return image_rendering != IMAGE_RENDERING_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__KERNING:
				return KERNING_EDEFAULT == null ? kerning != null : !KERNING_EDEFAULT.equals(kerning);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LETTER_SPACING:
				return LETTER_SPACING_EDEFAULT == null ? letter_spacing != null : !LETTER_SPACING_EDEFAULT.equals(letter_spacing);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LIGHTING_COLOR:
				return LIGHTING_COLOR_EDEFAULT == null ? lighting_color != null : !LIGHTING_COLOR_EDEFAULT.equals(lighting_color);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_END:
				return MARKER_END_EDEFAULT == null ? marker_end != null : !MARKER_END_EDEFAULT.equals(marker_end);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_MID:
				return MARKER_MID_EDEFAULT == null ? marker_mid != null : !MARKER_MID_EDEFAULT.equals(marker_mid);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_START:
				return MARKER_START_EDEFAULT == null ? marker_start != null : !MARKER_START_EDEFAULT.equals(marker_start);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MASKS:
				return MASKS_EDEFAULT == null ? masks != null : !MASKS_EDEFAULT.equals(masks);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OPACITY:
				return OPACITY_EDEFAULT == null ? opacity != null : !OPACITY_EDEFAULT.equals(opacity);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OVERFLOW:
				return overflow != OVERFLOW_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__POINTER_EVENTS:
				return pointer_events != POINTER_EVENTS_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SHAPE_RENDERING:
				return shape_rendering != SHAPE_RENDERING_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_COLOR:
				return STOP_COLOR_EDEFAULT == null ? stop_color != null : !STOP_COLOR_EDEFAULT.equals(stop_color);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_OPACITY:
				return STOP_OPACITY_EDEFAULT == null ? stop_opacity != null : !STOP_OPACITY_EDEFAULT.equals(stop_opacity);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE:
				return STROKE_EDEFAULT == null ? stroke != null : !STROKE_EDEFAULT.equals(stroke);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHARRAY:
				return STROKE_DASHARRAY_EDEFAULT == null ? stroke_dasharray != null : !STROKE_DASHARRAY_EDEFAULT.equals(stroke_dasharray);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHOFFSET:
				return STROKE_DASHOFFSET_EDEFAULT == null ? stroke_dashoffset != null : !STROKE_DASHOFFSET_EDEFAULT.equals(stroke_dashoffset);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINECAP:
				return stroke_linecap != STROKE_LINECAP_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINEJOIN:
				return stroke_linejoin != STROKE_LINEJOIN_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_MITERLIMIT:
				return STROKE_MITERLIMIT_EDEFAULT == null ? stroke_miterlimit != null : !STROKE_MITERLIMIT_EDEFAULT.equals(stroke_miterlimit);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_OPACITY:
				return STROKE_OPACITY_EDEFAULT == null ? stroke_opacity != null : !STROKE_OPACITY_EDEFAULT.equals(stroke_opacity);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_WIDTH:
				return STROKE_WIDTH_EDEFAULT == null ? stroke_width != null : !STROKE_WIDTH_EDEFAULT.equals(stroke_width);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_ANCHOR:
				return text_anchor != TEXT_ANCHOR_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_DECORATION:
				return TEXT_DECORATION_EDEFAULT == null ? text_decoration != null : !TEXT_DECORATION_EDEFAULT.equals(text_decoration);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_RENDERING:
				return text_rendering != TEXT_RENDERING_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__UNICODE_BIDI:
				return unicode_bidi != UNICODE_BIDI_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WORD_SPACING:
				return WORD_SPACING_EDEFAULT == null ? word_spacing != null : !WORD_SPACING_EDEFAULT.equals(word_spacing);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WRITING_MODE:
				return writing_mode != WRITING_MODE_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_HREF:
				return XLINK_HREF_EDEFAULT == null ? xlink__href != null : !XLINK_HREF_EDEFAULT.equals(xlink__href);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_SHOW:
				return XLINK_SHOW_EDEFAULT == null ? xlink__show != null : !XLINK_SHOW_EDEFAULT.equals(xlink__show);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ACTUATE:
				return XLINK_ACTUATE_EDEFAULT == null ? xlink__actuate != null : !XLINK_ACTUATE_EDEFAULT.equals(xlink__actuate);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TYPE:
				return XLINK_TYPE_EDEFAULT == null ? xlink__type != null : !XLINK_TYPE_EDEFAULT.equals(xlink__type);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ROLE:
				return XLINK_ROLE_EDEFAULT == null ? xlink__role != null : !XLINK_ROLE_EDEFAULT.equals(xlink__role);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ARCROLE:
				return XLINK_ARCROLE_EDEFAULT == null ? xlink__arcrole != null : !XLINK_ARCROLE_EDEFAULT.equals(xlink__arcrole);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TITLE:
				return XLINK_TITLE_EDEFAULT == null ? xlink__title != null : !XLINK_TITLE_EDEFAULT.equals(xlink__title);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__RESOLVED_INSTANCE:
				return resolvedInstance != null;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CHILDREN:
				return children != null && !children.isEmpty();
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__EXTERNAL_RESOURCES_REQUIRED:
				return EXTERNAL_RESOURCES_REQUIRED_EDEFAULT == null ? externalResourcesRequired != null : !EXTERNAL_RESOURCES_REQUIRED_EDEFAULT.equals(externalResourcesRequired);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CX:
				return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CY:
				return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__R:
				return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FX:
				return FX_EDEFAULT == null ? fx != null : !FX_EDEFAULT.equals(fx);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FY:
				return FY_EDEFAULT == null ? fy != null : !FY_EDEFAULT.equals(fy);
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SPREAD_METHOD:
				return spreadMethod != SPREAD_METHOD_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_UNITS:
				return gradientUnits != GRADIENT_UNITS_EDEFAULT;
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GRADIENT_TRANSFORM:
				return GRADIENT_TRANSFORM_EDEFAULT == null ? gradientTransform != null : !GRADIENT_TRANSFORM_EDEFAULT.equals(gradientTransform);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GradientElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CoreAttributes.class) {
			switch (derivedFeatureID) {
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ID: return SvgPackage.CORE_ATTRIBUTES__ID;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_BASE: return SvgPackage.CORE_ATTRIBUTES__XML_BASE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_LANG: return SvgPackage.CORE_ATTRIBUTES__XML_LANG;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_SPACE: return SvgPackage.CORE_ATTRIBUTES__XML_SPACE;
				default: return -1;
			}
		}
		if (baseClass == PresentationAttributes.class) {
			switch (derivedFeatureID) {
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ALIGNMENT_BASELINE: return SvgPackage.PRESENTATION_ATTRIBUTES__ALIGNMENT_BASELINE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__BASELINE_SHIFT: return SvgPackage.PRESENTATION_ATTRIBUTES__BASELINE_SHIFT;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP: return SvgPackage.PRESENTATION_ATTRIBUTES__CLIP;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_PATH: return SvgPackage.PRESENTATION_ATTRIBUTES__CLIP_PATH;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_RULE: return SvgPackage.PRESENTATION_ATTRIBUTES__CLIP_RULE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR: return SvgPackage.PRESENTATION_ATTRIBUTES__COLOR;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION: return SvgPackage.PRESENTATION_ATTRIBUTES__COLOR_INTERPOLATION;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION_FILTERS: return SvgPackage.PRESENTATION_ATTRIBUTES__COLOR_INTERPOLATION_FILTERS;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_PROFILE: return SvgPackage.PRESENTATION_ATTRIBUTES__COLOR_PROFILE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_RENDERING: return SvgPackage.PRESENTATION_ATTRIBUTES__COLOR_RENDERING;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CURSOR: return SvgPackage.PRESENTATION_ATTRIBUTES__CURSOR;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DIRECTION: return SvgPackage.PRESENTATION_ATTRIBUTES__DIRECTION;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DISPLAY: return SvgPackage.PRESENTATION_ATTRIBUTES__DISPLAY;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DOMINANT_BASELINE: return SvgPackage.PRESENTATION_ATTRIBUTES__DOMINANT_BASELINE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ENABLE_BACKGROUND: return SvgPackage.PRESENTATION_ATTRIBUTES__ENABLE_BACKGROUND;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL: return SvgPackage.PRESENTATION_ATTRIBUTES__FILL;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_OPACITY: return SvgPackage.PRESENTATION_ATTRIBUTES__FILL_OPACITY;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_RULE: return SvgPackage.PRESENTATION_ATTRIBUTES__FILL_RULE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILTER: return SvgPackage.PRESENTATION_ATTRIBUTES__FILTER;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_COLOR: return SvgPackage.PRESENTATION_ATTRIBUTES__FLOOD_COLOR;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_OPACITY: return SvgPackage.PRESENTATION_ATTRIBUTES__FLOOD_OPACITY;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_FAMILY: return SvgPackage.PRESENTATION_ATTRIBUTES__FONT_FAMILY;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE: return SvgPackage.PRESENTATION_ATTRIBUTES__FONT_SIZE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE_ADJUST: return SvgPackage.PRESENTATION_ATTRIBUTES__FONT_SIZE_ADJUST;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STRETCH: return SvgPackage.PRESENTATION_ATTRIBUTES__FONT_STRETCH;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STYLE: return SvgPackage.PRESENTATION_ATTRIBUTES__FONT_STYLE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_VARIANT: return SvgPackage.PRESENTATION_ATTRIBUTES__FONT_VARIANT;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_WEIGHT: return SvgPackage.PRESENTATION_ATTRIBUTES__FONT_WEIGHT;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_HORIZONTAL: return SvgPackage.PRESENTATION_ATTRIBUTES__GLYPH_ORIENTATION_HORIZONTAL;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_VERTICAL: return SvgPackage.PRESENTATION_ATTRIBUTES__GLYPH_ORIENTATION_VERTICAL;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__IMAGE_RENDERING: return SvgPackage.PRESENTATION_ATTRIBUTES__IMAGE_RENDERING;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__KERNING: return SvgPackage.PRESENTATION_ATTRIBUTES__KERNING;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LETTER_SPACING: return SvgPackage.PRESENTATION_ATTRIBUTES__LETTER_SPACING;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LIGHTING_COLOR: return SvgPackage.PRESENTATION_ATTRIBUTES__LIGHTING_COLOR;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_END: return SvgPackage.PRESENTATION_ATTRIBUTES__MARKER_END;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_MID: return SvgPackage.PRESENTATION_ATTRIBUTES__MARKER_MID;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_START: return SvgPackage.PRESENTATION_ATTRIBUTES__MARKER_START;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MASKS: return SvgPackage.PRESENTATION_ATTRIBUTES__MASKS;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OPACITY: return SvgPackage.PRESENTATION_ATTRIBUTES__OPACITY;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OVERFLOW: return SvgPackage.PRESENTATION_ATTRIBUTES__OVERFLOW;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__POINTER_EVENTS: return SvgPackage.PRESENTATION_ATTRIBUTES__POINTER_EVENTS;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SHAPE_RENDERING: return SvgPackage.PRESENTATION_ATTRIBUTES__SHAPE_RENDERING;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_COLOR: return SvgPackage.PRESENTATION_ATTRIBUTES__STOP_COLOR;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_OPACITY: return SvgPackage.PRESENTATION_ATTRIBUTES__STOP_OPACITY;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE: return SvgPackage.PRESENTATION_ATTRIBUTES__STROKE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHARRAY: return SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_DASHARRAY;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHOFFSET: return SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_DASHOFFSET;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINECAP: return SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_LINECAP;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINEJOIN: return SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_LINEJOIN;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_MITERLIMIT: return SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_MITERLIMIT;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_OPACITY: return SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_OPACITY;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_WIDTH: return SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_WIDTH;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_ANCHOR: return SvgPackage.PRESENTATION_ATTRIBUTES__TEXT_ANCHOR;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_DECORATION: return SvgPackage.PRESENTATION_ATTRIBUTES__TEXT_DECORATION;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_RENDERING: return SvgPackage.PRESENTATION_ATTRIBUTES__TEXT_RENDERING;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__UNICODE_BIDI: return SvgPackage.PRESENTATION_ATTRIBUTES__UNICODE_BIDI;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__VISIBILITY: return SvgPackage.PRESENTATION_ATTRIBUTES__VISIBILITY;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WORD_SPACING: return SvgPackage.PRESENTATION_ATTRIBUTES__WORD_SPACING;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WRITING_MODE: return SvgPackage.PRESENTATION_ATTRIBUTES__WRITING_MODE;
				default: return -1;
			}
		}
		if (baseClass == XLinkAttributes.class) {
			switch (derivedFeatureID) {
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_HREF: return SvgPackage.XLINK_ATTRIBUTES__XLINK_HREF;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_SHOW: return SvgPackage.XLINK_ATTRIBUTES__XLINK_SHOW;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ACTUATE: return SvgPackage.XLINK_ATTRIBUTES__XLINK_ACTUATE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TYPE: return SvgPackage.XLINK_ATTRIBUTES__XLINK_TYPE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ROLE: return SvgPackage.XLINK_ATTRIBUTES__XLINK_ROLE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ARCROLE: return SvgPackage.XLINK_ATTRIBUTES__XLINK_ARCROLE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TITLE: return SvgPackage.XLINK_ATTRIBUTES__XLINK_TITLE;
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__RESOLVED_INSTANCE: return SvgPackage.XLINK_ATTRIBUTES__RESOLVED_INSTANCE;
				default: return -1;
			}
		}
		if (baseClass == ContentElement.class) {
			switch (derivedFeatureID) {
				case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CHILDREN: return SvgPackage.CONTENT_ELEMENT__CHILDREN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GradientElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CoreAttributes.class) {
			switch (baseFeatureID) {
				case SvgPackage.CORE_ATTRIBUTES__ID: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ID;
				case SvgPackage.CORE_ATTRIBUTES__XML_BASE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_BASE;
				case SvgPackage.CORE_ATTRIBUTES__XML_LANG: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_LANG;
				case SvgPackage.CORE_ATTRIBUTES__XML_SPACE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XML_SPACE;
				default: return -1;
			}
		}
		if (baseClass == PresentationAttributes.class) {
			switch (baseFeatureID) {
				case SvgPackage.PRESENTATION_ATTRIBUTES__ALIGNMENT_BASELINE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ALIGNMENT_BASELINE;
				case SvgPackage.PRESENTATION_ATTRIBUTES__BASELINE_SHIFT: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__BASELINE_SHIFT;
				case SvgPackage.PRESENTATION_ATTRIBUTES__CLIP: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP;
				case SvgPackage.PRESENTATION_ATTRIBUTES__CLIP_PATH: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_PATH;
				case SvgPackage.PRESENTATION_ATTRIBUTES__CLIP_RULE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CLIP_RULE;
				case SvgPackage.PRESENTATION_ATTRIBUTES__COLOR: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR;
				case SvgPackage.PRESENTATION_ATTRIBUTES__COLOR_INTERPOLATION: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION;
				case SvgPackage.PRESENTATION_ATTRIBUTES__COLOR_INTERPOLATION_FILTERS: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_INTERPOLATION_FILTERS;
				case SvgPackage.PRESENTATION_ATTRIBUTES__COLOR_PROFILE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_PROFILE;
				case SvgPackage.PRESENTATION_ATTRIBUTES__COLOR_RENDERING: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__COLOR_RENDERING;
				case SvgPackage.PRESENTATION_ATTRIBUTES__CURSOR: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CURSOR;
				case SvgPackage.PRESENTATION_ATTRIBUTES__DIRECTION: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DIRECTION;
				case SvgPackage.PRESENTATION_ATTRIBUTES__DISPLAY: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DISPLAY;
				case SvgPackage.PRESENTATION_ATTRIBUTES__DOMINANT_BASELINE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__DOMINANT_BASELINE;
				case SvgPackage.PRESENTATION_ATTRIBUTES__ENABLE_BACKGROUND: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__ENABLE_BACKGROUND;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FILL: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FILL_OPACITY: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_OPACITY;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FILL_RULE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILL_RULE;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FILTER: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FILTER;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FLOOD_COLOR: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_COLOR;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FLOOD_OPACITY: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FLOOD_OPACITY;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FONT_FAMILY: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_FAMILY;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FONT_SIZE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FONT_SIZE_ADJUST: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_SIZE_ADJUST;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FONT_STRETCH: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STRETCH;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FONT_STYLE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_STYLE;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FONT_VARIANT: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_VARIANT;
				case SvgPackage.PRESENTATION_ATTRIBUTES__FONT_WEIGHT: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__FONT_WEIGHT;
				case SvgPackage.PRESENTATION_ATTRIBUTES__GLYPH_ORIENTATION_HORIZONTAL: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_HORIZONTAL;
				case SvgPackage.PRESENTATION_ATTRIBUTES__GLYPH_ORIENTATION_VERTICAL: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__GLYPH_ORIENTATION_VERTICAL;
				case SvgPackage.PRESENTATION_ATTRIBUTES__IMAGE_RENDERING: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__IMAGE_RENDERING;
				case SvgPackage.PRESENTATION_ATTRIBUTES__KERNING: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__KERNING;
				case SvgPackage.PRESENTATION_ATTRIBUTES__LETTER_SPACING: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LETTER_SPACING;
				case SvgPackage.PRESENTATION_ATTRIBUTES__LIGHTING_COLOR: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__LIGHTING_COLOR;
				case SvgPackage.PRESENTATION_ATTRIBUTES__MARKER_END: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_END;
				case SvgPackage.PRESENTATION_ATTRIBUTES__MARKER_MID: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_MID;
				case SvgPackage.PRESENTATION_ATTRIBUTES__MARKER_START: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MARKER_START;
				case SvgPackage.PRESENTATION_ATTRIBUTES__MASKS: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__MASKS;
				case SvgPackage.PRESENTATION_ATTRIBUTES__OPACITY: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OPACITY;
				case SvgPackage.PRESENTATION_ATTRIBUTES__OVERFLOW: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__OVERFLOW;
				case SvgPackage.PRESENTATION_ATTRIBUTES__POINTER_EVENTS: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__POINTER_EVENTS;
				case SvgPackage.PRESENTATION_ATTRIBUTES__SHAPE_RENDERING: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__SHAPE_RENDERING;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STOP_COLOR: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_COLOR;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STOP_OPACITY: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STOP_OPACITY;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STROKE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_DASHARRAY: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHARRAY;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_DASHOFFSET: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_DASHOFFSET;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_LINECAP: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINECAP;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_LINEJOIN: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_LINEJOIN;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_MITERLIMIT: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_MITERLIMIT;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_OPACITY: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_OPACITY;
				case SvgPackage.PRESENTATION_ATTRIBUTES__STROKE_WIDTH: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__STROKE_WIDTH;
				case SvgPackage.PRESENTATION_ATTRIBUTES__TEXT_ANCHOR: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_ANCHOR;
				case SvgPackage.PRESENTATION_ATTRIBUTES__TEXT_DECORATION: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_DECORATION;
				case SvgPackage.PRESENTATION_ATTRIBUTES__TEXT_RENDERING: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__TEXT_RENDERING;
				case SvgPackage.PRESENTATION_ATTRIBUTES__UNICODE_BIDI: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__UNICODE_BIDI;
				case SvgPackage.PRESENTATION_ATTRIBUTES__VISIBILITY: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__VISIBILITY;
				case SvgPackage.PRESENTATION_ATTRIBUTES__WORD_SPACING: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WORD_SPACING;
				case SvgPackage.PRESENTATION_ATTRIBUTES__WRITING_MODE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__WRITING_MODE;
				default: return -1;
			}
		}
		if (baseClass == XLinkAttributes.class) {
			switch (baseFeatureID) {
				case SvgPackage.XLINK_ATTRIBUTES__XLINK_HREF: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_HREF;
				case SvgPackage.XLINK_ATTRIBUTES__XLINK_SHOW: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_SHOW;
				case SvgPackage.XLINK_ATTRIBUTES__XLINK_ACTUATE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ACTUATE;
				case SvgPackage.XLINK_ATTRIBUTES__XLINK_TYPE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TYPE;
				case SvgPackage.XLINK_ATTRIBUTES__XLINK_ROLE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ROLE;
				case SvgPackage.XLINK_ATTRIBUTES__XLINK_ARCROLE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_ARCROLE;
				case SvgPackage.XLINK_ATTRIBUTES__XLINK_TITLE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__XLINK_TITLE;
				case SvgPackage.XLINK_ATTRIBUTES__RESOLVED_INSTANCE: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__RESOLVED_INSTANCE;
				default: return -1;
			}
		}
		if (baseClass == ContentElement.class) {
			switch (baseFeatureID) {
				case SvgPackage.CONTENT_ELEMENT__CHILDREN: return SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", xml__base: ");
		result.append(xml__base);
		result.append(", xml__lang: ");
		result.append(xml__lang);
		result.append(", xml__space: ");
		result.append(xml__space);
		result.append(", alignment_baseline: ");
		result.append(alignment_baseline);
		result.append(", baseline_shift: ");
		result.append(baseline_shift);
		result.append(", clip: ");
		result.append(clip);
		result.append(", clip_path: ");
		result.append(clip_path);
		result.append(", clip_rule: ");
		result.append(clip_rule);
		result.append(", color: ");
		result.append(color);
		result.append(", color_interpolation: ");
		result.append(color_interpolation);
		result.append(", color_interpolation_filters: ");
		result.append(color_interpolation_filters);
		result.append(", color_profile: ");
		result.append(color_profile);
		result.append(", color_rendering: ");
		result.append(color_rendering);
		result.append(", cursor: ");
		result.append(cursor);
		result.append(", direction: ");
		result.append(direction);
		result.append(", display: ");
		result.append(display);
		result.append(", dominant_baseline: ");
		result.append(dominant_baseline);
		result.append(", enable_background: ");
		result.append(enable_background);
		result.append(", fill: ");
		result.append(fill);
		result.append(", fill_opacity: ");
		result.append(fill_opacity);
		result.append(", fill_rule: ");
		result.append(fill_rule);
		result.append(", filter: ");
		result.append(filter);
		result.append(", flood_color: ");
		result.append(flood_color);
		result.append(", flood_opacity: ");
		result.append(flood_opacity);
		result.append(", font_family: ");
		result.append(font_family);
		result.append(", font_size: ");
		result.append(font_size);
		result.append(", font_size_adjust: ");
		result.append(font_size_adjust);
		result.append(", font_stretch: ");
		result.append(font_stretch);
		result.append(", font_style: ");
		result.append(font_style);
		result.append(", font_variant: ");
		result.append(font_variant);
		result.append(", font_weight: ");
		result.append(font_weight);
		result.append(", glyph_orientation_horizontal: ");
		result.append(glyph_orientation_horizontal);
		result.append(", glyph_orientation_vertical: ");
		result.append(glyph_orientation_vertical);
		result.append(", image_rendering: ");
		result.append(image_rendering);
		result.append(", kerning: ");
		result.append(kerning);
		result.append(", letter_spacing: ");
		result.append(letter_spacing);
		result.append(", lighting_color: ");
		result.append(lighting_color);
		result.append(", marker_end: ");
		result.append(marker_end);
		result.append(", marker_mid: ");
		result.append(marker_mid);
		result.append(", marker_start: ");
		result.append(marker_start);
		result.append(", masks: ");
		result.append(masks);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", overflow: ");
		result.append(overflow);
		result.append(", pointer_events: ");
		result.append(pointer_events);
		result.append(", shape_rendering: ");
		result.append(shape_rendering);
		result.append(", stop_color: ");
		result.append(stop_color);
		result.append(", stop_opacity: ");
		result.append(stop_opacity);
		result.append(", stroke: ");
		result.append(stroke);
		result.append(", stroke_dasharray: ");
		result.append(stroke_dasharray);
		result.append(", stroke_dashoffset: ");
		result.append(stroke_dashoffset);
		result.append(", stroke_linecap: ");
		result.append(stroke_linecap);
		result.append(", stroke_linejoin: ");
		result.append(stroke_linejoin);
		result.append(", stroke_miterlimit: ");
		result.append(stroke_miterlimit);
		result.append(", stroke_opacity: ");
		result.append(stroke_opacity);
		result.append(", stroke_width: ");
		result.append(stroke_width);
		result.append(", text_anchor: ");
		result.append(text_anchor);
		result.append(", text_decoration: ");
		result.append(text_decoration);
		result.append(", text_rendering: ");
		result.append(text_rendering);
		result.append(", unicode_bidi: ");
		result.append(unicode_bidi);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", word_spacing: ");
		result.append(word_spacing);
		result.append(", writing_mode: ");
		result.append(writing_mode);
		result.append(", xlink__href: ");
		result.append(xlink__href);
		result.append(", xlink__show: ");
		result.append(xlink__show);
		result.append(", xlink__actuate: ");
		result.append(xlink__actuate);
		result.append(", xlink__type: ");
		result.append(xlink__type);
		result.append(", xlink__role: ");
		result.append(xlink__role);
		result.append(", xlink__arcrole: ");
		result.append(xlink__arcrole);
		result.append(", xlink__title: ");
		result.append(xlink__title);
		result.append(", class: ");
		result.append(class_);
		result.append(", style: ");
		result.append(style);
		result.append(", externalResourcesRequired: ");
		result.append(externalResourcesRequired);
		result.append(", cx: ");
		result.append(cx);
		result.append(", cy: ");
		result.append(cy);
		result.append(", r: ");
		result.append(r);
		result.append(", fx: ");
		result.append(fx);
		result.append(", fy: ");
		result.append(fy);
		result.append(", spreadMethod: ");
		result.append(spreadMethod);
		result.append(", gradientUnits: ");
		result.append(gradientUnits);
		result.append(", gradientTransform: ");
		result.append(gradientTransform);
		result.append(')');
		return result.toString();
	}

} //SvgRadialGradientElementImpl
