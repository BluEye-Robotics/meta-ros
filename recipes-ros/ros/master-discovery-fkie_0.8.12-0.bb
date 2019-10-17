DESCRIPTION = "Discover the running ROS Masters in local network. The discovering is done by sending an echo heartbeat messages to a defined multicast group. The alternative is to use a zeroconf/avahi daemon to register the ROS master as service and discover other ROS masters."
AUTHOR = "Alexander Tiderko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-srvs multimaster-msgs-fkie std-srvs multimaster-msgs-fkie rospy roslib rosgraph python3-avahi avahi-daemon"

RDEPENDS_${PN} = "std-srvs multimaster-msgs-fkie rospy roslib rosgraph python3-avahi avahi-daemon"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/master_discovery_fkie/0.8.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e8f504062cf8cba1c075339df743ef77"
SRC_URI[sha256sum] = "a126c9f12ac3c9b370068d862b423f8476fa0d81b31e8474195049ab2ec28918"

ROS_SPN = "multimaster_fkie"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-master_discovery_fkie-0.8.12-0"

inherit catkin
