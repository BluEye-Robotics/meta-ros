# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Generic Messages for Communication with an Automotive Autonomous Platform"
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
ROS_AUTHOR = "Daniel Stanek <dstanek@autonomoustuff.com>"
HOMEPAGE = "http://github.com/astuff/automotive_platform_msgs"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "automotive_autonomy_msgs"
ROS_BPN = "automotive_platform_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    ros-environment \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/astuff/automotive_autonomy_msgs-release/archive/release/noetic/automotive_platform_msgs/3.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/automotive_platform_msgs"
SRC_URI = "git://github.com/astuff/automotive_autonomy_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "53a39547173eded2a7d1273f5fd0190e8dd25fee"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
