DESCRIPTION = "Synchronize the local ROS master to the remote masters discovered by master_discovery_fkie node. The registration of topics and services is only perform by local ROS master."
AUTHOR = "Alexander Tiderko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "multimaster-msgs-fkie master-discovery-fkie rospy roslib rosgraph multimaster-msgs-fkie master-discovery-fkie"

RDEPENDS_${PN} = "rospy roslib rosgraph multimaster-msgs-fkie master-discovery-fkie"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/master_sync_fkie/0.8.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2a9cbf8b0ebfd2341cbbffb76718d489"
SRC_URI[sha256sum] = "4b3b2e87577c4ef67a8e479f9c71dd2352320e3559fa054cff279e245418299c"

ROS_SPN = "multimaster_fkie"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-master_sync_fkie-0.8.10-0"

inherit catkin
