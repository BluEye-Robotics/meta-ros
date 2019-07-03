DESCRIPTION = "A reverse ROS bridge for the MiR100 robot"
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch actionlib-msgs diagnostic-msgs dynamic-reconfigure geometry-msgs mir-actions mir-msgs move-base-msgs nav-msgs python-websocket rosgraph-msgs rospy rospy-message-converter sensor-msgs std-msgs tf visualization-msgs"

RDEPENDS_${PN} = "mir-description robot-state-publisher"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_driver/1.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "520e1705a3baf557c8b621d627254255"
SRC_URI[sha256sum] = "da99d11e458c15ad666321a49d43326ee91a75b969f98f8bb904c7bf0a071188"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_driver-1.0.4-1"

inherit catkin
