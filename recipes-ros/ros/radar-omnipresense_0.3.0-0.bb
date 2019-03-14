DESCRIPTION = "This is the radar driver package developed for the omnipresense radar module."
AUTHOR = "Garren Hendricks"
SECTION = "devel"
LICENSE = "ECL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=6d93b2a4bfce5342635d2a6eaaf27653"

DEPENDS = "roscpp rospy std-msgs message-generation rostest roscpp rospy std-msgs"

RDEPENDS_${PN} = "message-runtime roscpp rospy std-msgs message-generation"

SRC_URI = "https://github.com/SCU-RSL-ROS/radar_omnipresense-release/archive/release/melodic/radar_omnipresense/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "089eb496e99024f53c615f0cb7de668e"
SRC_URI[sha256sum] = "f82a2ead3bd79d78a4b0e123824adb03e08ca62c227ed8359c866e7f7e6fc56d"

S = "${WORKDIR}/radar_omnipresense-release-release-melodic-radar_omnipresense-0.3.0-0"

inherit catkin
