DESCRIPTION = "hector_geotiff provides a node that can be used to save occupancy grid map, robot trajectory and object of interest data to RoboCup Rescue compliant GeoTiff images."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hector-map-tools hector-nav-msgs nav-msgs pluginlib roscpp std-msgs libqt4-dev hector-map-tools hector-nav-msgs nav-msgs pluginlib roscpp std-msgs libqt4-dev"

RDEPENDS_${PN} = "hector-map-tools hector-nav-msgs nav-msgs pluginlib roscpp std-msgs libqt4-dev"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_geotiff/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "24bb389d81414db5546e8f46e136bd29"
SRC_URI[sha256sum] = "c536b4ab26359dd301470c0b2aa2e26aba77ea63bd70b54b53e8f0686ef6dffb"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_geotiff-0.4.0-1"

inherit catkin
