DESCRIPTION = "This package provides ROS specific hooks for stage"
AUTHOR = "Brian Gerky"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost geometry-msgs nav-msgs roscpp rostest sensor-msgs stage std-msgs std-srvs tf boost geometry-msgs nav-msgs roscpp sensor-msgs stage std-msgs std-srvs tf"

RDEPENDS_${PN} = "boost geometry-msgs nav-msgs roscpp sensor-msgs stage std-msgs std-srvs tf"

SRC_URI = "https://github.com/ros-gbp/stage_ros-release/archive/release/melodic/stage_ros/1.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2cca864078011b5bf1968e771850e368"
SRC_URI[sha256sum] = "5762c477b0401c12f43573895f7a94ec3bdfddc4aa9fe3a127d3acc1ce2960d8"

S = "${WORKDIR}/stage_ros-release-release-melodic-stage_ros-1.8.0-0"

inherit catkin
