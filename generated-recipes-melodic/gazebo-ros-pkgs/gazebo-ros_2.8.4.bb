# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Provides ROS plugins that offer message and service publishers for interfacing with <a href="http://gazebosim.org">Gazebo</a> through ROS.     Formally simulator_gazebo/gazebo"
AUTHOR = "Jose Luis Rivero <jrivero@osrfoundation.org>"
ROS_AUTHOR = "John Hsu"
HOMEPAGE = "http://gazebosim.org/tutorials?cat=connect_ros"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "gazebo_ros_pkgs"
ROS_BPN = "gazebo_ros"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    gazebo-msgs \
    gazebo-rosdev \
    geometry-msgs \
    libtinyxml \
    roscpp \
    rosgraph-msgs \
    roslib \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    gazebo-msgs \
    geometry-msgs \
    libtinyxml \
    roscpp \
    rosgraph-msgs \
    roslib \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    gazebo-msgs \
    gazebo-rosdev \
    geometry-msgs \
    libtinyxml \
    roscpp \
    rosgraph-msgs \
    roslib \
    std-msgs \
    std-srvs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/melodic/gazebo_ros/2.8.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c680876f0f7d33bd5c0fa1571efd9170"
SRC_URI[sha256sum] = "fde5c96dfbdfcd8550ae4b731d199348b50955157f0bc114f754c5a55170ca8a"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-melodic-gazebo_ros-2.8.4-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('gazebo-ros-pkgs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('gazebo-ros-pkgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gazebo-ros-pkgs/gazebo-ros-pkgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gazebo-ros-pkgs/gazebo-ros-pkgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gazebo-ros-pkgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gazebo-ros-pkgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}