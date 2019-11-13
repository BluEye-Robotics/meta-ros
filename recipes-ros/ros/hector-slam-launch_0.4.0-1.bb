DESCRIPTION = "hector_slam_launch contains launch files for launching hector_slam with different robot systems/setups/postprocessing scenarios."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hector-mapping hector-map-server hector-trajectory-server hector-geotiff hector-geotiff-plugins"

RDEPENDS_${PN} = "hector-mapping hector-map-server hector-trajectory-server hector-geotiff hector-geotiff-plugins"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_slam_launch/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6b4abab86f510ec8281bf2901b15bd13"
SRC_URI[sha256sum] = "f88c7c33d567ec3e10e4d619b8d8e61d787ea2df0504759bf8513bf142ce9486"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_slam_launch-0.4.0-1"

inherit catkin
