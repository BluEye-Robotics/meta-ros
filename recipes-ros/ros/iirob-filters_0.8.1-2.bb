DESCRIPTION = "The iirob_filters package implements following filters: 1) Low-Pass 2) Moving Mean 3) Gravity Compensation (used for force-torque sensors) 4) Threshold Filter 5) Kalman Filter"
AUTHOR = "Denis Štogl"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "cmake-modules dynamic-reconfigure eigen-conversions filters geometry-msgs pluginlib roscpp rosparam-handler tf2-ros rostest"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/KITrobotics/iirob_filters-release/archive/release/melodic/iirob_filters/0.8.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "56cf69bcea560a18a681d4470459f676"
SRC_URI[sha256sum] = "6629c570ce81b0181753951b2c3376bfe2c81ba9d8819f32380e8a5e668c3494"

S = "${WORKDIR}/iirob_filters-release-release-melodic-iirob_filters-0.8.1-2"

inherit catkin
