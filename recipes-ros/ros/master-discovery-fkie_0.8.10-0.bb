DESCRIPTION = "Discover the running ROS Masters in local network. The discovering is done by sending an echo heartbeat messages to a defined multicast group. The alternative is to use a zeroconf/avahi daemon to register the ROS master as service and discover other ROS masters."
AUTHOR = "Alexander Tiderko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-srvs multimaster-msgs-fkie std-srvs multimaster-msgs-fkie rospy roslib rosgraph python-avahi avahi-daemon"

RDEPENDS_${PN} = "std-srvs multimaster-msgs-fkie rospy roslib rosgraph python-avahi avahi-daemon"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/master_discovery_fkie/0.8.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e7d2bb18c9b263d233a2c63f8a09b196"
SRC_URI[sha256sum] = "bed1b9628b65746572e5ad687ae614f1a1011fed933da0700a673e7ab1146c0a"

ROS_SPN = "multimaster_fkie"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-master_discovery_fkie-0.8.10-0"

inherit catkin
