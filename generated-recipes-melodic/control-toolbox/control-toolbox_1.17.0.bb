# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Melonee Wise"
HOMEPAGE = "http://ros.org/wiki/control_toolbox"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "control_toolbox"
ROS_BPN = "control_toolbox"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    control-msgs \
    dynamic-reconfigure \
    libtinyxml \
    message-generation \
    realtime-tools \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    control-msgs \
    dynamic-reconfigure \
    libtinyxml \
    realtime-tools \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-msgs \
    dynamic-reconfigure \
    libtinyxml \
    message-runtime \
    realtime-tools \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/control_toolbox-release/archive/release/melodic/control_toolbox/1.17.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "53934c060496938b94a56ad5f367c979"
SRC_URI[sha256sum] = "87d87fd3110630b61fba232464add3e10dca4f7e6a080cf4900827cccf711c56"
S = "${WORKDIR}/control_toolbox-release-release-melodic-control_toolbox-1.17.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('control-toolbox', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('control-toolbox', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/control-toolbox/control-toolbox_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/control-toolbox/control-toolbox-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/control-toolbox/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/control-toolbox/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}