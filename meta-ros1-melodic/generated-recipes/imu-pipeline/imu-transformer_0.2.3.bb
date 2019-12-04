# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Node/nodelet combination to transform sensor_msgs::Imu data from one frame into another."
AUTHOR = "Paul Bovbel <pbovbel@clearpathrobotics.com>"
ROS_AUTHOR = "Paul Bovbel <pbovbel@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/imu_transformer"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

ROS_CN = "imu_pipeline"
ROS_BPN = "imu_transformer"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-filters \
    nodelet \
    roscpp \
    roslaunch \
    sensor-msgs \
    tf2 \
    tf2-ros \
    tf2-sensor-msgs \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-filters \
    nodelet \
    roscpp \
    roslaunch \
    sensor-msgs \
    tf \
    tf2 \
    tf2-ros \
    tf2-sensor-msgs \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-filters \
    nodelet \
    roscpp \
    roslaunch \
    sensor-msgs \
    tf \
    tf2 \
    tf2-ros \
    tf2-sensor-msgs \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/imu_pipeline-release/archive/release/melodic/imu_transformer/0.2.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/imu_transformer"
SRC_URI = "git://github.com/ros-gbp/imu_pipeline-release;${ROS_BRANCH};protocol=https"
SRCREV = "76daf06b3bf6f6b89bf9c106669983ffce53e379"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}