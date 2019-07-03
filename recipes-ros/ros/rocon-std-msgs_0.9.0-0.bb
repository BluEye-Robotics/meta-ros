DESCRIPTION = "Standard messages used by other rocon specific package types."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation std-msgs rocon-service-pair-msgs message-runtime std-msgs rocon-service-pair-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs rocon-service-pair-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/rocon_std_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e66a6be093bf32698f6d61b1d87c90a"
SRC_URI[sha256sum] = "6f2aa4bddb42919a924d828b30e6eb4a2d25066bafe4d707c4a394393e138f18"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-rocon_std_msgs-0.9.0-0"

inherit catkin
