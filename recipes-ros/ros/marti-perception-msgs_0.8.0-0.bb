DESCRIPTION = "marti_perception_msgs"
AUTHOR = "Edmond DuPont"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs sensor-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/melodic/marti_perception_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "756a62a478be93bee466d877f5f57d66"
SRC_URI[sha256sum] = "932dd1ea5a1543bb44c53eabdd16fbf0810a79b4d55089f7360ddaa4363ca974"

ROS_SPN = "marti_messages"
S = "${WORKDIR}/marti_messages-release-release-melodic-marti_perception_msgs-0.8.0-0"

inherit catkin
