DESCRIPTION = "Messages used by the platform app manager."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation rocon-std-msgs rocon-service-pair-msgs message-runtime rocon-std-msgs rocon-service-pair-msgs"

RDEPENDS_${PN} = "message-runtime rocon-std-msgs rocon-service-pair-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/rocon_app_manager_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "056c30d17964c2b674fcc3bbdaa0965b"
SRC_URI[sha256sum] = "dd9cbe7dd36e32d793f7429a581102e9e0f0cf8dd0dd3ff3baa12f3a03b4c8f5"

ROS_SPN = "rocon_msgs"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-rocon_app_manager_msgs-0.9.0-0"

inherit catkin
