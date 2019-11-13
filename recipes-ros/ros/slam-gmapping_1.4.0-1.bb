DESCRIPTION = "slam_gmapping contains a wrapper around gmapping which provides SLAM capabilities."
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "openslam-gmapping gmapping"

RDEPENDS_${PN} = "openslam-gmapping gmapping"

SRC_URI = "https://github.com/ros-gbp/slam_gmapping-release/archive/release/melodic/slam_gmapping/1.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f74b054270187e1a50b1256f6babf017"
SRC_URI[sha256sum] = "4adbd05d0930a653589ec957ec87bc93075f2372e08fc8c4b2514b88423fad0b"

S = "${WORKDIR}/slam_gmapping-release-release-melodic-slam_gmapping-1.4.0-1"

inherit catkin
