DESCRIPTION = "This package defines messages for storing calibration samples to be used in full robot calibration procedures. This package is still unstable. Expect the messages to change."
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs message-generation sensor-msgs std-msgs geometry-msgs message-runtime sensor-msgs std-msgs"

RDEPENDS_${PN} = "geometry-msgs message-runtime sensor-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/calibration_msgs/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ebf30ee454ab235f202681f90231038c"
SRC_URI[sha256sum] = "f85ef3c769ab6d3c7dd2b91cd681c2364657302db08d2107b5d3eb1f29ac1bdf"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-calibration_msgs-0.10.14-0"

inherit catkin
