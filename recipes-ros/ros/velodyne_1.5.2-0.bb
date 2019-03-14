DESCRIPTION = "Basic ROS support for the Velodyne 3D LIDARs."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "velodyne-driver velodyne-laserscan velodyne-msgs velodyne-pointcloud"

SRC_URI = "https://github.com/ros-drivers-gbp/velodyne-release/archive/release/melodic/velodyne/1.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "183ace23282972b70c0b32eb26245e87"
SRC_URI[sha256sum] = "31d4489ac69e37ba7a4d928e66b9d25af331252dca9ebdd9a3be6a2a0c52dde9"

S = "${WORKDIR}/velodyne-release-release-melodic-velodyne-1.5.2-0"

inherit catkin
