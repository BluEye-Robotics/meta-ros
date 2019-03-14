DESCRIPTION = "Tools for calculating the intersection of interval messages coming in on several topics. This package is experimental and unstable. Expect its APIs to change."
AUTHOR = "Romain Thibaux"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs boost calibration-msgs geometry-msgs rosconsole roscpp roscpp-serialization rostime std-msgs actionlib actionlib-msgs boost calibration-msgs geometry-msgs rosconsole roscpp roscpp-serialization rostime std-msgs"

RDEPENDS_${PN} = "actionlib actionlib-msgs boost calibration-msgs geometry-msgs rosconsole roscpp roscpp-serialization rostime std-msgs"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/interval_intersection/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eedd7f3dd84ab78c22ccc139e9e69d23"
SRC_URI[sha256sum] = "4466aa2fd48b25d0fa963f756b1ed3c5bb4bcba29d9dc1fc6d392d2dfe4685a5"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-interval_intersection-0.10.14-0"

inherit catkin
