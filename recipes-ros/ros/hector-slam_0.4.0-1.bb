DESCRIPTION = "The hector_slam metapackage that installs hector_mapping and related packages."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hector-compressed-map-transport hector-geotiff hector-geotiff-plugins hector-imu-attitude-to-tf hector-map-server hector-map-tools hector-mapping hector-marker-drawing hector-nav-msgs hector-slam-launch hector-trajectory-server"

RDEPENDS_${PN} = "hector-compressed-map-transport hector-geotiff hector-geotiff-plugins hector-imu-attitude-to-tf hector-map-server hector-map-tools hector-mapping hector-marker-drawing hector-nav-msgs hector-slam-launch hector-trajectory-server"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_slam/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "149bcb4dd6064bc2c8e49d21171c559d"
SRC_URI[sha256sum] = "2285de5a4920e257cfb7d9f1a6bd121c00b53201c49060552c17ed78511ffb60"

S = "${WORKDIR}/hector_slam-release-release-melodic-hector_slam-0.4.0-1"

inherit catkin
