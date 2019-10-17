DESCRIPTION = "The uuv_trajectory_control package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "rospy roslib python-numpy python-matplotlib python-pyyaml python-scipy geometry-msgs uuv-control-msgs tf std-msgs nav-msgs visualization-msgs uuv-assistants"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_trajectory_control/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "30e0638e13367df510163faeb3e91825"
SRC_URI[sha256sum] = "a20414665f3403e5ba772634d148eaef5bc2d703c4d5e5ff4196f8b6557bd3cd"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_trajectory_control-0.6.13-0"

inherit catkin
