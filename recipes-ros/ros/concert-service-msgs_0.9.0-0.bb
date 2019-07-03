DESCRIPTION = "Messages used by official rocon services."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation rocon-service-pair-msgs rocon-std-msgs message-runtime rocon-service-pair-msgs rocon-std-msgs"

RDEPENDS_${PN} = "message-runtime rocon-service-pair-msgs rocon-std-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/concert_service_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aca2a1907b23d6fa6be185639d80cdea"
SRC_URI[sha256sum] = "6d75585b6bc21b04e3823b99a4e009572e37fd42a154351f34dd5d582d4502e7"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-concert_service_msgs-0.9.0-0"

inherit catkin
