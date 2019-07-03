DESCRIPTION = "ROS message definitions for Rslidar 3D LIDARs."
AUTHOR = "Tony Zhang"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/CPFL/robosense-release/archive/release/melodic/rslidar_msgs/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "70f1b465082886b6709e3b81eea87fd5"
SRC_URI[sha256sum] = "5e648cc16e6b3f0db83e8ce00c9609f6f2da14f0d29951c2cb63e2e2716f953d"

ROS_SPN = "robosense"
S = "${WORKDIR}/robosense-release-release-melodic-rslidar_msgs-1.0.2-0"

inherit catkin
