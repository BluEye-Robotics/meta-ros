DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by sensor_msgs/LaserScan into a point cloud as defined by sensor_msgs/PointCloud or sensor_msgs/PointCloud2. In particular, it contains functionality to account for the skew resulting from moving robots or tilting laser scanners."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles boost cmake-modules libeigen roscpp sensor-msgs tf angles boost libeigen python-numpy roscpp sensor-msgs tf"

RDEPENDS_${PN} = "angles boost libeigen python-numpy roscpp sensor-msgs tf"

SRC_URI = "https://github.com/ros-gbp/laser_geometry-release/archive/release/melodic/laser_geometry/1.6.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f9cc63311e2daf49ca415324dde352c3"
SRC_URI[sha256sum] = "d2c0acb926c14dd2000db4b395b3bbcc26b53fc76461f4cf7c262947e3ed9138"

S = "${WORKDIR}/laser_geometry-release-release-melodic-laser_geometry-1.6.4-0"

inherit catkin
