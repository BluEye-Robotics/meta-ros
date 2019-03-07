SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "80a4501d355b9886efa1d533a7a6acbc"
SRC_URI[sha256sum] = "9959b9963a5c112f71995405e8aa6d4dcf634e9f38f061ed7577d3db449179d6"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "urdf"
