DESCRIPTION = "This package is used for gridmap SLAM. The interface is similar to gmapping (http://wiki. ros. org/gmapping) but the package supports different particle-filter algorithms, range-only SLAM, can work with several grid maps simultaneously and more."
AUTHOR = "Vladislav Tananaev"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslaunch roslib tf std-msgs sensor-msgs visualization-msgs nav-msgs mrpt-bridge dynamic-reconfigure mrpt1"

RDEPENDS_${PN} = " mrpt-rawlog mvsim"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_slam-release/archive/release/melodic/mrpt_rbpf_slam/0.1.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9e88157d7e6b85c43420f4dcf5e3fb60"
SRC_URI[sha256sum] = "2fd5cdd073352fb979256ca6083d9f490d90681592a4c7c9ff16d8f2c2d4ad21"

ROS_SPN = "mrpt_slam"
S = "${WORKDIR}/mrpt_slam-release-release-melodic-mrpt_rbpf_slam-0.1.8-0"

inherit catkin
