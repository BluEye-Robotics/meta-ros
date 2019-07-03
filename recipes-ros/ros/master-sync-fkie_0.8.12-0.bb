DESCRIPTION = "Synchronize the local ROS master to the remote masters discovered by master_discovery_fkie node. The registration of topics and services is only perform by local ROS master."
AUTHOR = "Alexander Tiderko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "multimaster-msgs-fkie master-discovery-fkie rospy roslib rosgraph multimaster-msgs-fkie master-discovery-fkie"

RDEPENDS_${PN} = "rospy roslib rosgraph multimaster-msgs-fkie master-discovery-fkie"

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/master_sync_fkie/0.8.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "736b78982235aac2cd3332a1c2e30cd4"
SRC_URI[sha256sum] = "14b81d9024f42cd1ad4eb7e35af79cdddc3682c38bbc867fea109156368b4814"

ROS_SPN = "multimaster_fkie"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-master_sync_fkie-0.8.12-0"

inherit catkin
