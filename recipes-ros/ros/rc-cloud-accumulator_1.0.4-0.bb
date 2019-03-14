DESCRIPTION = "A viewer for the SLAM component of roboception based on ROS and PCL"
AUTHOR = "Felix Endres"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs nav-msgs tf2 tf2-ros tf2-msgs std-srvs pcl-ros roscpp pcl libvtk-qt"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/roboception-gbp/rc_cloud_accumulator-release/archive/release/melodic/rc_cloud_accumulator/1.0.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "23807b23e2ab9c74379c6cba81bafe33"
SRC_URI[sha256sum] = "6356622f9801312add690a710948202c253adab5a5540ae0875e9bca83c8ee40"

S = "${WORKDIR}/rc_cloud_accumulator-release-release-melodic-rc_cloud_accumulator-1.0.4-0"

inherit catkin
