DESCRIPTION = "Defines helper functions and routines that greatly help when trying to create a settler for a specific sensor channel. This package is experimental and unstable. Expect its APIs to change."
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost calibration-msgs rosconsole rostime boost calibration-msgs rosconsole rostime"

RDEPENDS_${PN} = "boost calibration-msgs rosconsole rostime"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/settlerlib/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5943400d9ea07dd9d97ebd937d9241b5"
SRC_URI[sha256sum] = "795d9982aacaca98ad5750e40e707596f6a88b7f7f703ee664ebd98464d861b8"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-settlerlib-0.10.14-0"

inherit catkin
