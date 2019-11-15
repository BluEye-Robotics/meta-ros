DESCRIPTION = "Motion limiter package for collision prevention"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl roscpp diagnostic-updater geometry-msgs pcl-conversions sensor-msgs std-msgs tf2-ros tf2-sensor-msgs neonavigation-common safety-limiter-msgs cmake-modules libeigen xmlrpcpp"

RDEPENDS_${PN} = "libpcl-all"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/safety_limiter/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "60d09371bfe3ef94ac71ec81b58c0c61"
SRC_URI[sha256sum] = "28056423f972bfdafd1ea71ba51d1d78911494241657813b5840ee34e7148db1"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-safety_limiter-0.5.0-1"

inherit catkin
