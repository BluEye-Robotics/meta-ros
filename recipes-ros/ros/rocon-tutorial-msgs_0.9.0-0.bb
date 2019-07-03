DESCRIPTION = "Messages used by rocon tutorials."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation rocon-service-pair-msgs message-runtime rocon-service-pair-msgs"

RDEPENDS_${PN} = "message-runtime rocon-service-pair-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/rocon_tutorial_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6a5657c4a0acda16ebad697711347993"
SRC_URI[sha256sum] = "dd66eaad5af5cbccfcd60f6d2fe5152c3b560f2aa87e471da4a195c4f1ba1870"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-rocon_tutorial_msgs-0.9.0-0"

inherit catkin
