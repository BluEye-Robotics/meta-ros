DESCRIPTION = "Extract a single ring of a Velodyne PointCloud2 and publish it as a LaserScan message"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp nodelet sensor-msgs dynamic-reconfigure"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-drivers-gbp/velodyne-release/archive/release/melodic/velodyne_laserscan/1.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "09eaf1e6ad4440262f3fd2301c13cf80"
SRC_URI[sha256sum] = "7a79ee1a1f2efe7e9e20695fea816a595f442ad661d13a345a918df1a9e39fa3"

ROS_SPN = "velodyne"
S = "${WORKDIR}/velodyne-release-release-melodic-velodyne_laserscan-1.5.2-0"

inherit catkin
