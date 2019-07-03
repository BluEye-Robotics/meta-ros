DESCRIPTION = "rosrt provides classes for interfacing with ROS from within realtime systems, such as realtime-safe Publisher and Subscriber classes."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslib rosunit rosatomic allocators lockfree std-msgs roscpp roslib rosunit rosatomic allocators lockfree std-msgs"

RDEPENDS_${PN} = "roscpp roslib rosunit rosatomic allocators lockfree std-msgs"

SRC_URI = "https://github.com/ros-gbp/ros_realtime-release/archive/release/melodic/rosrt/1.0.25-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "51cbf3bed72f9eeef53128ee15edbf06"
SRC_URI[sha256sum] = "ab1cb91949e270a78898a6d03547538b9c4da40d82d9da354cda672ba8585f11"

ROS_SPN = "ros_realtime"
S = "${WORKDIR}/ros_realtime-release-release-melodic-rosrt-1.0.25-0"

inherit catkin
