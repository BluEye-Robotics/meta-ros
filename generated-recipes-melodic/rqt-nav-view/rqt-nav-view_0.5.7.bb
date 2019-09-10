# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "rqt_nav_view provides a gui for viewing navigation maps and paths."
AUTHOR = "Aaron Blasdel <ablasdel@gmail.com>"
ROS_AUTHOR = "Ze'ev Klapow"
HOMEPAGE = "http://wiki.ros.org/rqt_nav_view"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_nav_view"
ROS_BPN = "rqt_nav_view"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    python-qt-binding \
    qt-gui \
    rospy \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    python-qt-binding \
    qt-gui \
    rospy \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rqt_nav_view-release/archive/release/melodic/rqt_nav_view/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c73f7e79682b0322d17906ada3f4c63b"
SRC_URI[sha256sum] = "a531ad91a1753f9dd2b74d56b519c52aebeac013373f76c6e4e6b19c66ca46a0"
S = "${WORKDIR}/rqt_nav_view-release-release-melodic-rqt_nav_view-0.5.7-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rqt-nav-view', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rqt-nav-view', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-nav-view/rqt-nav-view_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-nav-view/rqt-nav-view-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-nav-view/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-nav-view/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}